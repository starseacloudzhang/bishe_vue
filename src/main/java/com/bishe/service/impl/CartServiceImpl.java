package com.bishe.service.impl;

import com.bishe.dao.CartDao;
import com.bishe.dao.GsDAO;
import com.bishe.entity.Cart;
import com.bishe.entity.Gs;
import com.bishe.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartDao cartDao;
    @Autowired
    private GsDAO gsDAO;

    @Override
    public void addCart(Cart cart) {
        //查询当前要添加的商品是否以存在
        Cart result=cartDao.findByidAndUid(cart.getTid(), cart.getUid());
        if(result==null){
            cart.setUid(cart.getUid());
            cart.setTid(cart.getTid());
            cart.setId(cart.getId());
            Gs gs=gsDAO.findById(String.valueOf(cart.getTid()));
            cart.setPrice(gs.getPrice());
            cart.setShopname(gs.getGuoshuname());
            cart.setPic(gs.getPhoto());


            Integer rows=cartDao.insert(cart);
            if(rows!=1){
                throw new RuntimeException("插入数据异常！");
            }
        }else{//当前的商品已经存在，则更新num
            Integer num=result.getId()+cart.getId();
            cart.setId(num);
            cart.setCid(result.getCid());
            Integer rows=cartDao.update(cart);
            if(rows!=1){
                throw new RuntimeException("更新数据异常！");
            }
        }
    }

    @Override
    public List<Cart> findByUid(Integer uid) {
        Cart cart=new Cart();
        cart.setUid(uid);
        return cartDao.findByUid(uid);
    }

    @Override
    public void delete(Integer cid, Integer uid) {
         cartDao.delete(cid,uid);
    }
}
