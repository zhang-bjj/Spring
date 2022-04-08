package com.bjj;

import com.alibaba.druid.pool.DruidDataSource;
import com.bjj.model.Bjj;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.sql.DataSource;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class BjjbootApplicationTests {

    @Autowired
    private Bjj bjj;

    @Autowired
    DataSource dataSource;

    /**
     * 输出数据源test
     * @throws SQLException
     */
    @Test
    void contextLoads() throws SQLException {
        System.out.println(bjj.toString());
        //看一下默认数据源
        System.out.println(dataSource.getClass());
        //获得连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        DruidDataSource druidDataSource = (DruidDataSource) dataSource;
        System.out.println("druidDataSource 数据源最大连接数：" + druidDataSource.getMaxActive());
        System.out.println("druidDataSource 数据源初始化连接数：" + druidDataSource.getInitialSize());

        connection.close();
    }

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void sendMail(){
        //邮件设置1：一个简单的邮件
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("不将就会议");
        message.setText("今晚7:30开会");

        message.setTo("2581548799@qq.com");
        message.setFrom("2581548799@qq.com");
        mailSender.send(message);
    }

    @Test
    public void sendMail2() throws MessagingException {
        //邮件设置2：一个复杂的邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setSubject("不将就会议");
        helper.setText("<b style='color:red'>今天 7:30来开会</b>",true);

        //发送附件
        helper.addAttachment("1.jpg",new File("C:\\Users\\dell\\Pictures\\img\\111.jpg"));
        helper.addAttachment("2.jpg",new File("C:\\Users\\dell\\Pictures\\img\\222.jpg"));

        helper.setTo("2581548799@qq.com");
        helper.setFrom("2581548799@qq.com");

        mailSender.send(mimeMessage);
    }

}
