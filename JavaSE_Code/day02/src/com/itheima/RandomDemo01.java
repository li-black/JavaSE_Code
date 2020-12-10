package com.itheima;
//获取一个十以内的随机数并打印

import java.util.Random;

public class RandomDemo01 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <= 10; i++) {
            int number = r.nextInt(10);
            System.out.println(number);
        }
    }
} 