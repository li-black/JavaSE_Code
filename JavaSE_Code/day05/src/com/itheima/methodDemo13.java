package com.itheima;

//定义带参数的方法check判断num的奇偶性并在main方法中调用check
public class methodDemo13 {
    public static void main(String[] args) {
        check(15);
    }

    public static void check(int num) {
        if (num % 2 == 1) {
            System.out.println("奇数");
        } else {
            System.out.println("偶数");
        }
    }
}
