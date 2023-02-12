package com.bishe.controller;

import com.bishe.service.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebSocketController {
    @GetMapping("/socket/{cid}")
    public ModelAndView socket(@PathVariable String cid){
        ModelAndView mav= new ModelAndView("/socket");
        mav.addObject("cid",cid);
        return mav;
    }
    @ResponseBody
    @RequestMapping("/socket/push/{cid}")
    public String pushToWeb(@PathVariable String cid,String message){
        try {
            WebSocketServer.sendInfo(message,cid);
        }catch (Exception e){
            e.printStackTrace();
            return "推送失败";
        }
        return "发送成功";
    }

}
