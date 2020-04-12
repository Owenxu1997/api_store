package com.zhbit.apistore02.intercetor;

import com.zhbit.apistore02.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("正在执行拦截器");
        System.out.println(handler);
        User user = (User) request.getSession().getAttribute("sessionUser");

        if(user == null) {
            response.sendRedirect(request.getContextPath() + "/user/toLogin");
            System.out.println("用户未登陆，跳转至登录页面...");
            return false;
        }

        System.out.println("无需拦截，放行！");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("执行posthandler");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("执行afterCompletion");
    }
}
