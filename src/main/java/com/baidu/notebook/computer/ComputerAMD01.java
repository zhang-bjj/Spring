package com.baidu.notebook.computer;

/**
 * @ClassName: ComputerAMD01
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/3 9:49
 * @Version: 1.0
 **/
public class ComputerAMD01 extends EVC implements BIOS {

    @Override
    public String getBIOS(String system) {
        return system;
    }

    @Override
    public String getModel(String Emodel) {
        return Emodel;
    }
}
