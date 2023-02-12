
package com.bishe.service;


import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@ServerEndpoint("/websocket/{sid}")
@Component

public class WebSocketServer {
    static Log log =  LogFactory.getLog(WebSocketServer.class);
//    静态变量记录当前连接数
    private static  int onlineCount=0;
//    concurrent包的线程set
    private static CopyOnWriteArraySet<WebSocketServer>webSocketSet
        = new CopyOnWriteArraySet<WebSocketServer>();
//    与客户端连接会话，通过session给客户端发送数据
    private Session session;
//    接收sid
    private  String sid="";
    
/*
    * 连接成功的调用方法
    * */

    @OnOpen
    public void  onOpen(Session session, @PathParam("sid")String sid){
        this.session=session;
        webSocketSet.add(this);//加入set中
        addOnlineCount();//
       log.info("有新窗口开始监听："+sid+"当前在线人数为"+ getOnlineCount());
        this.sid=sid;
        try{
            sendMessage("连接成功");
        }catch (IOException e){
          log.error("websocket IO异常");
        }
    }


    /*
    * 连接关闭调用的方法
    * */
    @OnClose
    public void onClose(){
        webSocketSet.remove(this);
        subOnlineCount();
        log.info("有一连接关闭！当前在线人数为"+ getOnlineCount());
    }
    @OnMessage
    public void onMessage(String message,Session session){
//        log.info("收到来自"+sid+"的信息:"+message);
        for(WebSocketServer item:webSocketSet){
            try{
                item.sendMessage(message);
            }catch ( Exception e){
                e.printStackTrace();
            }
        }
    }
    @OnError
    public void onError(Session session,Throwable error){
       log.error("发生错误");
        error.printStackTrace();

    }






    public void sendMessage(String message)  throws IOException{
        this.session.getBasicRemote().sendText(message);
    }
    public static void sendInfo(String message,@PathParam("sid") String sid) throws IOException{
        log.info("推送消息到窗口"+sid+"推送内容："+message);
        for(WebSocketServer item:webSocketSet){
            try {
                if(sid==null){
                    item.sendMessage(message);
                }else if(item.sid.equals(sid)){
                    item.sendMessage(message);
                }
            }catch (Exception e){
                continue;
            }
        }
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized int subOnlineCount() {
        return WebSocketServer.onlineCount--;
    }



    public static synchronized int addOnlineCount() {
        return WebSocketServer.onlineCount++;
    }
}

