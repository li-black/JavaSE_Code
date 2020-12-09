package com.itheima;

//了解方法change中的值改变main中的值会不会跟着改变,结果是不会
public class methodDemo06 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println(number);
        change(number);
        System.out.println(number);
    }

    public static int change(int number) {
        number = 200;
        return number;
    }
}
