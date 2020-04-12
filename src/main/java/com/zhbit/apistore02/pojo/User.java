package com.zhbit.apistore02.pojo;


import org.apache.ibatis.type.Alias;

/**
 * 一个用户pojo用于测试数据库
 * @author owenxu
 * @version 0.1 2020-4-6
 */


public class User {

    private int id;
    private String name;
//    private String loginName;
//    private String address;
    private String password;


//    public String getLoginName() {
//        return loginName;
//    }
//
//    public void setLoginName(String loginname) {
//        this.loginName = loginname;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }


    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.password = pwd;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return password;
    }

    public void setPwd(String pwd) {
        this.password = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
