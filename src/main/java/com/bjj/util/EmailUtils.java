package com.bjj.util;

import com.bjj.model.BjjEmail;
import com.sun.mail.util.MailSSLSocketFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class EmailUtils {

    private static final Logger log = LoggerFactory.getLogger(EmailUtils.class);

    //发件人邮箱
    private static String email = "1968211897@qq.com";

    //邮箱授权码
    private static String password = "lsoobkgctqsodhbj";

    //邮件发送的服务器
    private static String host = "smtp.qq.com";

    public static void sendEmail(BjjEmail bjjEmail) {

        //获取系统属性
        Properties properties = new Properties();

        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);

        properties.put("mail.smtp.auth", "true");

        try {
            //关于QQ邮箱，还要设置SSL加密
            MailSSLSocketFactory sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.ssl.socketFactory", sf);

            // 获取默认session对象
            Session session = Session.getDefaultInstance(properties,new Authenticator(){
                public PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(email, password); //发件人邮件用户名、授权码
                }
            });

            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(email));

            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(bjjEmail.getUserEmail()));

            // Set Subject: 头部头字段
            message.setSubject(bjjEmail.getTitle());

            if ("1".equals(bjjEmail.getAnnexFlag())) {
                // 创建消息部分
                BodyPart messageBodyPart = new MimeBodyPart();

                // 消息
                messageBodyPart.setText(bjjEmail.getContent());

                // 创建多重消息
                Multipart multipart = new MimeMultipart();

                // 设置文本消息部分
                multipart.addBodyPart(messageBodyPart);

                // 附件部分
                messageBodyPart = new MimeBodyPart();
                String filename = "file.txt";
                messageBodyPart.setDataHandler(new DataHandler(new FileDataSource("D:\\file.txt")));
                messageBodyPart.setFileName(filename);
                multipart.addBodyPart(messageBodyPart);

                // 发送完整消息
                message.setContent(multipart);
            } else {
                // 设置消息体
                message.setText(bjjEmail.getContent());
            }

            // 发送消息
            Transport.send(message);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
