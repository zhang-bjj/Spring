package com.bjj.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Scope("prototype")
public class MyTask implements Runnable{

    private static final Logger logger = LoggerFactory.getLogger(MyTask.class);

    private final String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        logger.info("your name is "+name+" -----"+new Date(System.currentTimeMillis()));
    }

}
