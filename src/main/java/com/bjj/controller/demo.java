package com.bjj.controller;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName: persion
 * @Description: TODO
 * @Author: dell
 * @Date: 2020/7/20 10:29
 * @Version: 1.0
 **/
public class demo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123");
        sb.append("123").append("456").append("789").append(100);
        System.out.println("sb = " + sb);
        System.out.println("bs = " + sb.reverse());
        sb.reverse().toString();

        ArrayList<String> array = new ArrayList<>();
        array.add("111");
        array.add(1,"222");
        array.add(2,"333");
        array.add("444");
        System.out.println("array = " + array);
        System.out.println(array.remove("444"));
        System.out.println(array.remove(2));
        System.out.println("array = " + array);

        Random r = new Random();
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 100;
        arr[2] = 100;
        int[] arr2 = arr;
        arr2[0] = 120;
        arr2[1] = 120;
        arr2[2] = 120;
        int i = r.nextInt(100);
        System.out.println(i);
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
//        System.out.println(arr2[3]);
//        arr = null;
//        System.out.println(arr[0]);
        int a = 1;
        count(a);
        count(arr2);
        System.out.println(a);
        System.out.println(arr2[0]);
        String str = "123";
        System.out.println(str.equals("321"));
    }

    public static void count(int a){
        a = 10;
    }

    public static void count(int[] a){
        a[0] = 200;
    }

}
