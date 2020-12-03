package com.baidu.animal;

import com.baidu.animal.ife.Jumpping;

/**
 * @ClassName: Dog
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/2 11:32
 * @Version: 1.0
 **/
public class Dog implements Jumpping {

//    public abstract void eat();

    @Override
    public void jump() {
        System.out.println("dog jump.");
    }
}
