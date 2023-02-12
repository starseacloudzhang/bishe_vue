package com.bishe.service.impl;

import com.bishe.dao.UserDAO;
import com.bishe.entity.User;
import com.bishe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;//事务顺序
import org.springframework.util.ObjectUtils;

import java.util.Date;

@Service
@Transactional
public class UserServiceImp implements UserService {
    @Autowired//注入dao
    private UserDAO userDAO;
    @Override
//    插入数据到数据库,service业务层调用dao操作数据库
    public void regist(User user) {
//        通过user获取参数传递过来的方法
        //调用dao的方法findByUserName
        User userDB = userDAO.findByUserName(user.getUsername());

        if(userDB !=null){
            throw new RuntimeException("用户名已存在!");

        }
            //1.生成用户状态
            user.setState("已激活");
            //2.设置用户注册时间
            user.setRegistTime(new Date());
            //3.调用DAO

           Integer row = userDAO.save(user);
           if(row != 1){
               throw new RuntimeException("插入错误");
           }


    }

    @Override
    public User login(User user) {
        User userDB = userDAO.findByUserName(user.getUsername());
        if(!ObjectUtils.isEmpty(userDB)){
            //2.比较密码
            if (userDB.getPassword().equals(user.getPassword())) {
                return  userDB;
            }else{
                throw new RuntimeException("密码输入不正确!");
            }
        }else{
            throw  new  RuntimeException("用户名输入错误!");
        }

    }
}
