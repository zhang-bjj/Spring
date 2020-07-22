package com.bjj.service.impl;

import com.bjj.dao.UserMapper;
import com.bjj.model.User;
import com.bjj.model.UserExample;
import com.bjj.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "UserService")
@Transactional
public class UserServiceImpl implements UserService {

    @SuppressWarnings("all")
    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer add(User user) {
        return userMapper.insert(user);
    }

    @Override
    public PageInfo<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        UserExample example = new UserExample();
        List<User> userList = userMapper.selectByExample(example);
        return new PageInfo<>(userList);
    }

    @Override
    public PageInfo<User> findByName(String name) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);
        List<User> userList = userMapper.selectByExample(example);
        return new PageInfo<>(userList);
    }

    @Override
    public int insertBatch(List<User> list) {
        return userMapper.insertBatchSelective(list);
    }

    @Override
    public int updateBatch(List<User> list) {
        return userMapper.updateBatchByPrimaryKeySelective(list);
    }

}
