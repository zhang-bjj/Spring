package com.bjj.service;

/**
 * 调度任务接口类
 */
public interface TaskService {

    /**
     * 调度任务创建01
     */
    void add(String name);
    /**
     * 调度任务创建02
     */
    void add02(String name);

    /**
     * 调度任务重置
     */
    void touch(String name);

    /**
     * 调度任务清除
     */
    void delete(String name);
}
