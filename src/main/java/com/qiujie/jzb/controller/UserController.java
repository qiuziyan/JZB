package com.qiujie.jzb.controller;

import com.alibaba.fastjson.JSONObject;
import com.qiujie.jzb.exception.MyException;
import com.qiujie.jzb.model.Response;
import com.qiujie.jzb.model.User;
import com.qiujie.jzb.service.impl.IncomeExpensesService;
import com.qiujie.jzb.service.impl.UserService;
import com.qiujie.jzb.utils.DateUtil;
import com.qiujie.jzb.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    IncomeExpensesService incomeExpensesService;

    @RequestMapping("/login")
    public Response login(@RequestBody User user, HttpServletRequest request) throws Exception {
        Response rsp = new Response();
        User verUsre = userService.FindByUserName(user.getUserName());
        if(verUsre == null){
            rsp.setCode("-1");
            rsp.setMessage("用户不存在");
            return rsp;
        }
        if(MD5Util.verify(user.getPassWord(),verUsre.getPassWord())) {
            request.getSession().setAttribute("user",verUsre);
            rsp.setCode("0");
            rsp.setMessage("登录成功");
        }else{
            throw  new MyException("", "-1", "用户密码错误");
        }
        return rsp;
    }
    @RequestMapping("/getUserAssetInformation")
    public Response getUserAssetInformation(HttpServletRequest request){
        Response rsp  = new Response();
        User user =(User) request.getSession().getAttribute("user");
        //重新获取User信息
        user = userService.selectByPrimaryKey(user.getId());
        JSONObject userObj = (JSONObject) JSONObject.toJSON(user);
        //获取今日消费 以及 昨日消费
        String today = DateUtil.getCurrentDate("yyyy-MM-dd");
        String yestoday = DateUtil.getOffsetDate("yyyy-MM-dd",-1);
        double spendingToday = incomeExpensesService.getSpendingByDate(today, user.getId());
        double spendYestoday = incomeExpensesService.getSpendingByDate(yestoday,user.getId());
        userObj.put("spendingToday",spendingToday);
        userObj.put("spendYestoday",spendYestoday);
        rsp.setObj(userObj);
        return rsp;
    }


}
