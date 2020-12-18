package com.homeTest;

import java.util.Scanner;

public class Test31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "888888";
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户密码：");
            String s = sc.next();
            if (password.equals(s)) {
                System.out.println("xxx用户您好");
                while (true) {
                    System.out.println("请输入取款金额：");
                    int money = sc.nextInt();
                    if (money % 100 == 0 && money >= 0 && money <= 1000) {
                        System.out.println("正在出款...");
                        System.out.println("完成交易，请取卡...");
                        System.exit(0);
                    } else {
                        System.out.println("您输入的金额有误！请重新输入");
                    }
                }
            } else {
                System.out.println("您的密码输入错误！还有" + (2 - i) + "次机会");
            }
        }
    }
}
