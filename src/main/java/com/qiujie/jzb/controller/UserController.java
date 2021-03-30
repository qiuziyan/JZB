package com.qiujie.jzb.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse rseponse){
        request.getSession().setAttribute("users","123");
        request.getSession().setMaxInactiveInterval(60);
        return "success";
    }
    @RequestMapping("/success")
    public String success(){
        return "success";
    }
    @GetMapping("/index")
    public String loginhtml(){
        return "login";
    }
}
