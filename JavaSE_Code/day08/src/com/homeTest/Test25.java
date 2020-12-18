package com.homeTest;

import java.util.Scanner;

public class Test25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        System.out.println("请依次输入10个整数");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num == 1) {
                a++;
            } else if (num == 2) {
                b++;
            } else if (num == 3) {
                c++;
            } else {
                d++;
            }
        }
        System.out.println("1出现的次数：" + a);
        System.out.println("2出现的次数：" + b);
        System.out.println("3出现的次数：" + c);
        System.out.println("非法数据出现的次数：" + d);
    }
}
