package com.itheima.Testphone;

//测试Phone类
public class Testphone {
    public static void main(String[] args) {
        Phone pho = new Phone();
        System.out.println(pho);
        pho.brand = "小米Mix3";
        pho.price = 3299;
        System.out.println(pho.brand);
        System.out.println(pho.price);
        System.out.println(pho.brand + "..." + pho.price);
        pho.call("张三");
        pho.sendMessage();
    }
}
