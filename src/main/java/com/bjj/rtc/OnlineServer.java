package com.bjj.rtc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Vector;

/**
 * @ClassName: OnlineServer
 * @Description: 聊天室服务器，基于websocket协议
 * @Author: BJJ
 * @Date: 2021/3/8 14:41
 **/
@ServerEndpoint("/onlineServer")
@Component
public class OnlineServer {

    private static final Logger logger = LoggerFactory.getLogger(OnlineServer.class);

    private Session session;//当前会话对象 通过session 服务器可以向客户端主动发送消息

    private static Vector<OnlineServer> clients = new Vector<OnlineServer>();

    @OnOpen
    public void open(Session session){
        this.session = session;
        clients.add(this);
        logger.info("建立新连接!!!");
    }

    @OnClose
    public void close(){
        clients.remove(this);
        logger.info("连接断开!!!");
    }

    @OnMessage
    public void message(String message, Session session){
        for (OnlineServer client: clients) {
            try {
                client.session.getBasicRemote().sendText(message);
            } catch (IOException e) {
                e.printStackTrace();
                logger.info("发送失败===========>"+message);
            }
        }
    }

}
