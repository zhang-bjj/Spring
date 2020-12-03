package com.baidu.persion;

/**
 * @ClassName: Designer
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/2 9:34
 * @Version: 1.0
 **/
public class Designer extends Persion {

    public Designer() {
        System.out.println("This is Designer constructor methods.");
    }

    public Designer(String name, String age) {
        super(name, age);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("This is Designer show methods");
    }
}
