package com.homeTest;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("@@@ 欢迎使用黑马计算器 @@@");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择运算方式：[1加法/2减法/3乘法/4除法/5取余/0退出程序]");
            int a = sc.nextInt();
            if (a > 5 || a < 0) {
                System.out.println("您的选择有误！");
            } else if (a == 0) {
                System.out.println("感谢使用，再见！");
                System.exit(0);
            } else {
                System.out.println("请输入第一个整数：");
                int b = sc.nextInt();
                System.out.println("请输入第二个整数：");
                int c = sc.nextInt();
                if (a == 1) {
                    System.out.println("用户选择加法");
                    System.out.println(b + "+" + c + "=" + (b + c));
                }
                if (a == 2) {
                    System.out.println("用户选择减法");
                    System.out.println(b + "-" + c + "=" + (b - c));
                }
                if (a == 3) {
                    System.out.println("用户选择乘法");
                    System.out.println(b + "*" + c + "=" + (b * c));
                }
                if (a == 4) {
                    System.out.println("用户选择除法");
                    System.out.println(b + "/" + c + "=" + (b / c));
                }
                if (a == 5) {
                    System.out.println("用户选择取余");
                    System.out.println(b + "%" + c + "=" + (b % c));
                }
            }
        }
    }
}
