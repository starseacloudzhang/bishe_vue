package com.bishe.dao;

import com.bishe.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper //创建dao对象
public interface UserDAO {
     Integer save(User user);
    User findByUserName(String username);
}
