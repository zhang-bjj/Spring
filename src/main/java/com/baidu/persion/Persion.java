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
    private int sum;

    public Persion() {
        System.out.println("This is Persion constructor methods.");
    }

    public Persion(String name, String age, int sum) {
        this.name = name;
        this.age = age;
        this.sum = sum;
        System.out.println("This is Persion "+this.name+", "+this.age+" constructor methods.");
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
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
