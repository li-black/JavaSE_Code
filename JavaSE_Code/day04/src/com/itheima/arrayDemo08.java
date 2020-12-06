package com.itheima;

import java.util.Scanner;

public class arrayDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入要查找的数");
        int sum = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sum) {
                System.out.println(arr[i] + "第" + (i + 1) + "位数");
            }
        }
    }
}