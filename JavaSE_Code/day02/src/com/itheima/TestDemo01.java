package com.itheima;
//输入西红柿和土豆的重量计算并输出价钱

import java.util.Scanner;

public class TestDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入西红柿的重量：");
        int tomato = sc.nextInt();
        System.out.println("请输入土豆的重量：");
        int potato = sc.nextInt();
        double sum = tomato * 2.3 + potato * 1.5;
        System.out.println("西红柿和土豆的总价是：" + sum + "元");
    }
}