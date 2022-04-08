package com.web.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName: Utils
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/11 15:25
 * @Version: 1.0
 **/
public class Utils {

    public static final String driverClassName;
    public static final String url;
    public static final String username;
    public static final String password;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        driverClassName = properties.getProperty("driverClassName");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }

}
