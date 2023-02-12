package com.bishe.controller;

import com.bishe.entity.Cart;
import com.bishe.service.CartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin//跨域访问
@RequestMapping("cart")//域名
@Slf4j
public class CartController {
    @Autowired
    private CartService cartService;
    @PostMapping("insert")
    public Map<String, Object> inserts(@RequestBody Cart cart) {
        log.info("插入的数据",cart.toString());
        Map<String, Object> map = new HashMap<>();
        try {
            cartService.addCart(cart);
            map.put("state", true);
            map.put("code", 200);
            map.put("msg", "商品添加成功!");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品添加失败!");
        }
        return map;

    }
    @GetMapping("findByuid")
    public Map<String, Object> inserts(@RequestParam("uid") Integer uid) {
        Map<String, Object> map = new HashMap<>();
        try {
            List<Cart> carts=cartService.findByUid(uid);
            map.put("carlist",carts);
            map.put("code", 200);
            map.put("state", true);
            map.put("msg", "商品添加成功!");
        }catch (Exception e){
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品添加失败!");
        }
        return map;
    }
    @GetMapping("delete")
    public Map<String, Object> delete(Integer cid,Integer uid){
        Map<String, Object> map = new HashMap<>();
        try{
            cartService.delete(cid,uid);
            map.put("code", 200);
            map.put("state", true);
            map.put("msg", "商品删除成功!");
        }catch (Exception e){
            e.printStackTrace();
            map.put("state", false);
            map.put("code", 500);
            map.put("msg", "商品删除失败!");
        }
        return map;
    }


}
