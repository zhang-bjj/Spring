package com.bjj.util;

import org.springframework.stereotype.Component;

/**
 * @Author: zhangguohao
 * @Date: 2020/7/20 11:36
 **/
@Component
public class Config {

    /**
     * 调度时间
     */
    private int schedulerTime;

    public int getSchedulerTime() {
        return schedulerTime;
    }

    public void setSchedulerTime(int schedulerTime) {
        this.schedulerTime = schedulerTime;
    }
}
