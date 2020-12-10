package com.itheima;
//手动输入三个数并输出最大值

import java.util.Scanner;

public class ThreePeoplelvup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个人的身高");
        int height1 = sc.nextInt();
        System.out.println("请输入第二个人的身高");
        int height2 = sc.nextInt();
        System.out.println("请输入第三个人的身高");
        int height3 = sc.nextInt();
        int mid = height1 > height2 ? height1 : height2;
        int max = mid > height3 ? mid : height3;
        System.out.println("这三个人中身高最高的是：" + max + "cm");
    }
}