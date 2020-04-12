package com.zhbit.apistore02.service;


import com.zhbit.apistore02.dao.UserMapper;
import com.zhbit.apistore02.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User Sel(int id) {
        return userMapper.Sel(id);
    }

    public User login(String userName, String userPassword) {
        return userMapper.login(userName, userPassword);
    }

    public int register(User user) {
        return userMapper.register(user);
    }
}
