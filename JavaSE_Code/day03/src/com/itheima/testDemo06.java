package com.itheima;

import java.util.Scanner;

public class testDemo06 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数：");
        int a = sc.nextInt();
        int c = -1;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                c = i;
                break;
            }
        }
        System.out.println(c);
    }
}
