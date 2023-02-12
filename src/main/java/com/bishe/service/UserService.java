package com.bishe.service;

import com.bishe.entity.User;

public interface UserService {
//    定义一个接口用户注册
    void regist(User user);

//    用户登录
    User login(User user);
}
