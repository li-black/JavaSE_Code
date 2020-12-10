package com.itheima;
//算出一个数是几位数并且将它倒着输出

import java.util.Scanner;

public class ForDemo06 {
    public static void main(String[] args) {
        int count = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d = num;
        while (d > 0) {
            c = c * 10 + d % 10;
            d /= 10;
            count++;
        }
        System.out.println(count);
        System.out.println(c);
    }
}
