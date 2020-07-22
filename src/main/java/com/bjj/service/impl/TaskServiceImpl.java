package com.bjj.service.impl;

import com.bjj.service.TaskService;
import com.bjj.task.MyTask;
import com.bjj.util.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/**
 * 调度任务实现类
 */
@Service(value = "TaskServiceImpl")
public class TaskServiceImpl implements TaskService, ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);

    private Map<String, ScheduledFuture<?>> taskMap = new HashMap<>();

    private ApplicationContext applicationContext;

    @Value("${scheduler.time}")
    private int schedulerTime;

    @Autowired
    private Config config;

    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;

    @Override
    @SuppressWarnings("NullableProblems")
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 调度任务创建
     */
    @Override
    public void add(String name) {
        System.out.println("超时时间------"+schedulerTime);
        if(!"".equals(name)) {
            if(!taskMap.containsKey(name)) {
                MyTask myTask = applicationContext.getBean(MyTask.class, name);
                long timeout = System.currentTimeMillis() + config.getSchedulerTime()*1000;
                ScheduledFuture<?> schedule = threadPoolTaskScheduler.schedule(myTask, new Date(timeout));
                taskMap.put(name, schedule);
            }else {
                touch(name);
            }
            logger.info("调度任务创建成功------"+name);
        }else {
            logger.error("调度任务创建失败------"+name);
        }
    }

    @Override
    public void add02(String name) {
        if(!"".equals(name)) {
            String cron = "*/5 * * * * ?";
            ScheduledFuture<?> schedule = threadPoolTaskScheduler.schedule(new MyTask(name), new CronTrigger(cron));
            taskMap.put(name, schedule);
            logger.info("调度任务创建成功------"+name);
        }else {
            logger.error("调度任务创建失败------"+name);
        }
    }

    /**
     * 调度任务重置
     */
    @Override
    public void touch(String name) {
        if(!"".equals(name)) {
            ScheduledFuture<?> scheduledFuture = taskMap.get(name);
            if(scheduledFuture!=null) {
                scheduledFuture.cancel(true);
                MyTask myTask = applicationContext.getBean(MyTask.class, name);
                long timeout = System.currentTimeMillis() + config.getSchedulerTime()*1000;
                ScheduledFuture<?> schedule = threadPoolTaskScheduler.schedule(myTask, new Date(timeout));
                taskMap.put(name, schedule);
            }else {
                add(name);
            }
            logger.info("调度任务重置成功------"+name);
        }else {
            logger.error("调度任务重置失败------"+name);
        }
    }

    /**
     * 调度任务移除
     */
    @Override
    public void delete(String name) {
        if(!"".equals(name)) {
            if(null != taskMap.get(name)) {
                ScheduledFuture<?> scheduledFuture = taskMap.get(name);
                scheduledFuture.cancel(true);
                taskMap.remove(name);
                logger.info("调度任务移除成功------"+name);
            }else {
                logger.error("无此调度任务------"+name);
            }
        }else {
            logger.error("调度任务移除失败------"+name);
        }
    }
}
