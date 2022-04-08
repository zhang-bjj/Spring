package com.baidu.notebook.computer;

/**
 * @ClassName: EVC
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/3 10:00
 * @Version: 1.0
 **/
public abstract class EVC extends Brand {

    @Override
    public String getBrand(String brand) {
        return brand;
    }

    public abstract String getModel(String Emodel);
}
