package com.bjj.service;

import com.bjj.model.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {

    /**
     * 添加
     * @param User
     * @return
     */
    Integer add(User User);

    /**
     * 查询全部
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<User> findAllUser(int pageNum, int pageSize);

    /**
     * 根据名字查询
     * @param name
     * @return
     */
    PageInfo<User> findByName(String name);

    /**
     * 批量插入
     * @param list
     * @return
     */
    int insertBatch(List<User> list);

    /**
     * 批量更新
     * @param list
     * @return
     */
    int updateBatch(List<User> list);

}
