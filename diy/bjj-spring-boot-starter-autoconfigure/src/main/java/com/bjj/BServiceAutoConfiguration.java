package com.bjj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication //web应用生效
@EnableConfigurationProperties(BProperties.class)
public class BServiceAutoConfiguration {

    @Autowired
    BProperties bProperties;

    @Bean
    public BService bService(){
        BService service = new BService();
        service.setBProperties(bProperties);
        return service;
    }

}
