package com.bishe.service;


import com.bishe.entity.Cart;

import java.util.List;

public interface CartService {
    void addCart(Cart cart);
    List<Cart> findByUid(Integer uid);

    void delete(Integer cid,Integer uid);
}
