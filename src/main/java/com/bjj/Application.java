package com.bjj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement // 开启事务管理
@EnableScheduling            // 来开启定时任务
@MapperScan(basePackages = {"com.bjj.dao"}) // 扫描包路径
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
