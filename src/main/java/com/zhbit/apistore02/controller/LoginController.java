package com.zhbit.apistore02.controller;


import com.zhbit.apistore02.pojo.User;
import com.zhbit.apistore02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;


/**
 * 用户登陆注册controller
 * @author owenxu
 * @version 1.0 2020-4-8
 */

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String showLogin() {
        return "login";
    }

//    @ResponseBody
//    @RequestMapping("/loginUser")
    @PostMapping("/loginUser")
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("userPassword") String userPassword,
                        Map<String, Object> map,
                        HttpServletRequest request) {

        User loginUser = userService.login(userName, userPassword);

        if (loginUser == null) {
            map.put("msg", "用户名或密码错误");
            return "login";
        } else {
            //登录成功后将用户放入session中，用于拦截
            request.getSession().setAttribute("sessionUser", loginUser);
            return "indexPage";
//            return "/layuicms2.0/page/main";

        }
    }

    @RequestMapping("/toRegister")
    public String showRegister() {
        return "register";
    }

    @PostMapping("/registerUser")
    public String register(User user) {
        int su = userService.register(user);
        if( su==0 ){
            System.out.println("----");
        }
        return "indexPage";
//        return "/layuicms2.0/page/main";
    }

    //登陆之后才能看见的页面，用于测试拦截器
    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute("sessionUser");
        response.sendRedirect("/user/toLogin");
    }


}
