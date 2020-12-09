package com.itheima;
//定义一个长度为n的数组并且手动输入数据,最后遍历数组并输出数组所有元素的和

import java.util.Scanner;

public class arrayDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
