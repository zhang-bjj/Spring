package com.baidu.notebook.computer;

/**
 * @ClassName: Demo
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/3 10:07
 * @Version: 1.0
 **/
public class Demo {

    public static void main(String[] args) {
        ComputerAMD01 amd01 = new ComputerAMD01();
        System.out.println("Brand--------->" + amd01.getBrand("AMD"));
        System.out.println("Model--------->" + amd01.getModel("ROG-STRIX-RTX3090-O24G-GAMING"));
        System.out.println("BIOS--------->" + amd01.getBIOS("ROG"));
    }

}
