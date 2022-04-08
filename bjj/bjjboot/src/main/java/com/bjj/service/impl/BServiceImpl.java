package com.bjj.service.impl;

import com.bjj.service.BService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: BServiceImpl
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2021/1/7 11:34
 * @Version: 1.0
 **/
@Service
public class BServiceImpl implements BService {
    @Override
    public String show() {
        String show = "test";
        return show;
    }
}
