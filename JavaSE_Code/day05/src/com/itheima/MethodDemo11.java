package com.itheima;

//定义方法time和eat在time方法中调用eat,在main方法中调用time
public class MethodDemo11 {
    public static void main(String[] args) {
        time();
    }

    public static void time() {
        System.out.println("10点了");
        eat();
    }

    public static void eat() {
        System.out.println("吃饭");
    }

}
