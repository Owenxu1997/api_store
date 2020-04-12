package com.zhbit.apistore02.dao;

import com.zhbit.apistore02.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User Sel(int id);

    User login(String userName, String userPassword);

    int register(User user);
}
