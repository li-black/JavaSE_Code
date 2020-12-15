package com.homeTest;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入消费金额");
            double money = sc.nextInt();
            if (money <= 0) {
                System.out.println("输入有误!金额应该大于0元!");
            } else if (money < 500) {
                System.out.println("您消费" + money + "不享受折扣优惠!");
            } else if (money >= 500 && money < 1000) {
                double money1 = money * 0.95;
                System.out.println("您消费" + money + "元,享受95折优惠,折后金额：" + money1);
            } else if (money >= 1000 && money < 2000) {
                double money1 = money * 0.8;
                System.out.println("您消费" + money + "元,享受8折优惠,折后金额：" + money1);
            } else {
                double money1 = money * 0.7;
                System.out.println("您消费" + money + "元,享受7折优惠,折后金额：" + money1);
            }
        }
    }
}
