package com.baidu.animal;

import com.baidu.animal.ife.Jumpping;

/**
 * @ClassName: Demo
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/2 10:23
 * @Version: 1.0
 **/
public class Demo {

    public static void main(String[] args) {
        Animal a = new Cat();
//        Animal b = new Animal();
        Jumpping j = new Dog();
        j.jump();
        a.eat();
        a.sleep();
        System.out.println(getAddress("天津"));
    }

    public static String getAddress(String address){
        if(address==null)
            address = "北京";
        return address;
    }

}
