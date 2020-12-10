package com.itheima;
//定义check方法判断奇偶数,并且键盘输入调用check方法

import java.util.Scanner;

public class MethodDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        check(num);
    }

    public static void check(int a) {
        if (a % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
