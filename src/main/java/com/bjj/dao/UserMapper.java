package com.bjj.dao;

import java.util.List;

import com.bjj.model.User;
import com.bjj.model.UserExample;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 批量插入
     * @param list
     * @return
     */
    int insertBatchSelective(List list);

    /**
     * 批量更新
     * @param list
     * @return
     */
    int updateBatchByPrimaryKeySelective(List list);

}