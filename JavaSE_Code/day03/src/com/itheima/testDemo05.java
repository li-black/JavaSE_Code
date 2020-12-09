package com.itheima;
//定义一个长度为5的数组并手动输入5个数计算并打印数组的和

import java.util.Scanner;

public class testDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[5];
//        System.out.println("请输入五个整数");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数.");
//            int a = sc.nextInt();
//            arr[i] = a;
            arr[i] = sc.nextInt();
//            System.exit(0);
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组" + arr.length + "个数的和是：" + sum);
    }
}