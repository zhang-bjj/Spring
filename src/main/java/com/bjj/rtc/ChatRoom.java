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
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName: ChatRoom
 * @Description: 聊天室服务器，基于websocket协议
 * @Author: BJJ
 * @Date: 2021/3/8 17:51
 **/
@ServerEndpoint("/chatRoom")
@Component
public class ChatRoom {

    private static final Logger logger = LoggerFactory.getLogger(ChatRoom.class);

    private Session session;//当前会话对象 通过session 服务器可以向客户端主动发送消息

    private static Map<String, Session> clients = new ConcurrentHashMap<>();

    @OnOpen
    public void open(Session session){
        clients.put(session.getId(), session);
        logger.info("{}建立新连接!!!", session.getId());
    }

    @OnClose
    public void close(Session sessoin){
        clients.remove(sessoin.getId());
        logger.info("{}连接断开!!!", session.getId());
    }

    @OnMessage
    public void message(String message, Session session){
        for (Map.Entry<String, Session> sessionEntry:clients.entrySet()) {
            sessionEntry.getValue().getAsyncRemote().sendText(message);
            logger.info("发送成功===========>"+message);
        }
    }

}
