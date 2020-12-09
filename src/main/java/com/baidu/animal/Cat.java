package com.baidu.animal;

/**
 * @ClassName: Cat
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/2 10:24
 * @Version: 1.0
 **/
public class Cat extends Animal {

    private String food;

    public Cat(){
        System.out.println("吃鱼");
    }

    public Cat(String food){
        this.food = food;
        System.out.println("吃"+food);
    }

    @Override
    public void eat() {
        System.out.println("Cats eat fish.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                '}';
    }
}
