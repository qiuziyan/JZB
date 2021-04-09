package com.qiujie.jzb.controller;

import com.qiujie.jzb.exception.MyException;
import com.qiujie.jzb.model.Response;
import com.qiujie.jzb.model.User;
import com.qiujie.jzb.service.impl.UserService;
import com.qiujie.jzb.utils.MD5Util;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.NoSuchAlgorithmException;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public Response login(String userName, String password) throws Exception {
        Response rsp = new Response();
        User user = new User(userName,password);
        User verUsre = userService.selectUser(user);
        if(MD5Util.verify(user.getPassWord(),verUsre.getPassWord())) {
            rsp.setCode("0");
            rsp.setMessage("µÇÂ¼³É¹¦");
        }else{
            new MyException("", "-1", "µÇÂ¼ÃÜÂë´íÎó");
        }
        return rsp;
    }

}
