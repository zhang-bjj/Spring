package com.baidu.notebook.computer;

/**
 * @ClassName: ComputerAMD02
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/3 9:49
 * @Version: 1.0
 **/
public class ComputerAMD02 extends IVC implements BIOS {
    @Override
    public String getBIOS(String system) {
        return system;
    }

    @Override
    public String getModel(String Imodel) {
        return Imodel;
    }
}
