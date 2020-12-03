package com.baidu.notebook;

/**
 * @ClassName: MacBook
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/2 16:39
 * @Version: 1.0
 **/
public class MacBook {

    public static String str;
    private String price = "1w";

    /*public class CPU {

        public void use() {
            System.out.println(price);
        }

    }*/

    private class CPU {

        public void use() {
            System.out.println(price);
        }

    }

    public void methods() {
        CPU cpu = new CPU();
        cpu.use();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MacBook macBook = (MacBook) o;

        return price != null ? price.equals(macBook.price) : macBook.price == null;
    }

    @Override
    public String toString() {
        return "MacBook{" +
                "price='" + price + '\'' +
                '}';
    }
}
