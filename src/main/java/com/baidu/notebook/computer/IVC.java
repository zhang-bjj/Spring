package com.baidu.notebook.computer;

/**
 * @ClassName: IVC
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/3 10:00
 * @Version: 1.0
 **/
public abstract class IVC extends Brand {

    @Override
    public String getBrand(String brand) {
        return brand;
    }

    public abstract String getModel(String Imodel);

}
