package com.homeTest;

import java.util.Scanner;

public class Test26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("请依次输入五个整数：");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int[] newarr = new int[5];
        int num = 4;
        for (int i = 0; i < newarr.length; i++) {
            if (arr[num] < 0) {
                newarr[i] = 0;
                num--;
            } else {
                newarr[i] = arr[num];
                num--;
            }
        }
        System.out.println("新数组元素为：");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
