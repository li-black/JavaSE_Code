package com.itheima;

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
