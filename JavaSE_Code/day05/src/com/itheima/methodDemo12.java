package com.itheima;

//定义方法check判断num的奇偶性并在main方法中调用check
public class methodDemo12 {
    public static void main(String[] args) {
        check();
    }

    public static void check() {
        int num = 15;
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
