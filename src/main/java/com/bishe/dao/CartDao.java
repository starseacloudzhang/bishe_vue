package com.bishe.dao;

import com.bishe.entity.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface CartDao {
    Integer insert(Cart cart);
    Integer update(Cart cart);
    Cart findByidAndUid(Integer tid,Integer uid);

    List<Cart> findByUid(Integer uid);
    void delete(Integer cid,Integer uid);
}
