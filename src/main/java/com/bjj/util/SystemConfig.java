package com.bjj.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 系统配置
 * @author zhangguohao
 */
@Configuration
@EnableScheduling
public class SystemConfig {

    @Value("${scheduler.time}")
    private int schedulerTime;

    @Bean
    public Config config() {
        Config config = new Config();
        config.setSchedulerTime(schedulerTime);

        return config;
    }
    
}
