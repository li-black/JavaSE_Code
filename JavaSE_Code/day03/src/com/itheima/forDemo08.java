package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class forDemo08 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int i = r.nextInt(100) + 1;
        while (true) {
            System.out.println("请输入你猜的数字");
            int n = sc.nextInt();
            if (n < 1 || n > 100) {
                System.out.println("输入错误");
            } else if (n > i) {
                System.out.println("大了");
            } else if (n < i) {
                System.out.println("小了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
