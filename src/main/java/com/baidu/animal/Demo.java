package com.baidu.animal;

import com.baidu.animal.ife.Jumpping;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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

    public static void main(String[] args) throws UnknownHostException, ClassNotFoundException,
            NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
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

        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);
        ClassLoader c1 = c.getParent();
        System.out.println(c1);
        ClassLoader c2 = c1.getParent();
        System.out.println(c2);
//        ClassLoader c3 = c2.getParent();
//        System.out.println(c3);//NullPointerException
        Class<Cat> cat1 = Cat.class;
        System.out.println("class:" + cat1);
        Class<Cat> cat2 = Cat.class;
        System.out.println(cat1 == cat2);//true
        Class<? extends Cat> cat3 = new Cat().getClass();
        System.out.println(cat1 == cat3);//true
        Class<?> cat4 = Class.forName("com.baidu.animal.Cat");
        System.out.println(cat1 == cat4);//true

        Constructor<?>[] constructors = cat1.getConstructors();
        for (Constructor cs : constructors) {
            System.out.println("cs--->"+cs);
        }

        Constructor<?> cs = cat4.getConstructor();
        Constructor<?> cs1 = cat4.getConstructor(String.class);
        Object obj = cs.newInstance();
        Object obj1 = cs1.newInstance("拉面");
        System.out.println("obj====>"+obj);
        System.out.println("obj====>"+obj1);
    }

    public static String getAddress(String address) {
        if (address == null)
            address = "北京";
        return address;
    }

}
