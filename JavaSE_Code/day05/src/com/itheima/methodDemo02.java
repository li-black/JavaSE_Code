package com.itheima;

import java.util.Scanner;

public class methodDemo02 {
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
