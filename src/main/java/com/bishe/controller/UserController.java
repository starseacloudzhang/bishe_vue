package com.bishe.controller;

import com.bishe.entity.User;
import com.bishe.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin//跨域访问
@RequestMapping("user")//域名
@Slf4j
public class UserController {
//    调用service层，注入
    @Autowired
    private UserService userService;
    //路由,用来处理客户端注册请求
    @PostMapping("regist")
    //@RequestBody转化为json格式
    public Map<String, Object> regist(@RequestBody User user,
                                      HttpServletRequest request){
        log.info("用户信息:[{}]",user.toString());
        Map<String,Object> map = new HashMap<>();
        try {
            //调用业务方法
            userService.regist(user);
            map.put("state", true);
            map.put("msg", "注册成功");
        }catch (Exception e){
            e.printStackTrace();
            map.put("state", false);
            map.put("msg",e.getMessage());
        }

        return map;

    }
    @PostMapping("login")
    public Map<String,Object> login(@RequestBody User user, HttpSession session){
        log.info("当前登录用户的信息: [{}]",user.toString());
        Map<String, Object> map =  new HashMap<>();
        try {
            User userDB = userService.login(user);
            map.put("state",true);
            map.put("msg","登录成功!");

            //将登陆成功后的用户信息返回，用于页面上设置localStorage
            map.put("user",userDB);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("state",false);
            map.put("msg",e.getMessage());
        }
        return map;
    }

}
