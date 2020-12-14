package com.itheima.homeTest;

//判断5位数的回文数和七位数的回文数差多少数
public class Test {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 10000; i < 100000; i++) {
            int a = 0;
            int c = i;
            while (c > 0) {
                a = a * 10 + c % 10;
                c = c / 10;
            }
            if (a == i) {
                count1++;
            }
        }
        for (int i = 1000000; i < 10000000; i++) {
            int a = 0;
            int c = i;
            while (c > 0) {
                a = a * 10 + c % 10;
                c = c / 10;
            }
            if (a == i) {
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count2 - count1);
    }
}
