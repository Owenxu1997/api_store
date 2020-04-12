package com.zhbit.apistore02.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class IndexController {

    //后台首页
    @RequestMapping("/page/main.html")
    public String mainPage() {
        return "/page/main";
    }

    //所有API
    @RequestMapping("page/news/newsList.html")
    public String apiPage() {
        return "/page/news/newsList";
    }

    //添加API
    @RequestMapping("page/news/newsAdd.html")
    public String addApiPage() {
        return "/page/news/newsAdd";
    }

    //nav文档
    @RequestMapping("/page/doc/navDoc.html")
    public String navDoc() {
        return "/page/doc/navDoc";
    }

    @RequestMapping("/page/doc/addressDoc.html")
    public String addressDoc() {
        return "/page/doc/addressDoc";
    }

    @RequestMapping("/page/doc/bodyTabDoc.html")
    public String bodyTabDoc() {
        return "/page/doc/bodyTabDoc";
    }

    //用户中心
    @RequestMapping("page/user/userList.html")
    public String userCenter() {
        return "page/user/userList";
    }

    //会员等级
    @RequestMapping("page/user/userGrade.html")
    public String userGrade() {
        return "page/user/userGrade";
    }

    //404页面
    @RequestMapping("/page/404.html")
    public String missingPage() {
        return "/page/404";
    }


    //系统设置/系统基本参数
    @RequestMapping("/page/systemSetting/basicParameter.html")
    public String basicSettingPage() {
        return "/page/systemSetting/basicParameter";
    }
}
