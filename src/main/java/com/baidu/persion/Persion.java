package com.baidu.persion;

/**
 * @ClassName: Persion
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/2 9:30
 * @Version: 1.0
 **/
public class Persion {

    private String name;
    private String age;

    public Persion() {
        System.out.println("This is Persion constructor methods.");
    }

    public Persion(String name, String age) {
        this.name = name;
        this.age = age;
        System.out.println("This is Persion "+this.name+", "+this.age+" constructor methods.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void show(){
        System.out.println("This is Persion show methods");
    }
}
