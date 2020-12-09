package com.baidu.animal;

import com.baidu.animal.ife.Jumpping;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName: Demo
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/2 10:23
 * @Version: 1.0
 **/
public class Demo {

    public static void main(String[] args) throws UnknownHostException {
        Animal a = new Cat();
//        Animal b = new Animal();
        Jumpping j = new Dog();
        j.jump();
        a.eat();
        a.sleep();
        System.out.println(getAddress("天津"));
        InetAddress ia = InetAddress.getByName("192.168.9.27");
        System.out.println(ia.getHostName());
        System.out.println(ia.getHostAddress());
    }

    public static String getAddress(String address){
        if(address==null)
            address = "北京";
        return address;
    }

}
