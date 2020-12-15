package com.homeTest;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] arr = new int[5];
        System.out.println("随机数组：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(61) + 7;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("请输入一个[3-5]之间的整数：");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num == 0) {
                System.out.print(arr[i] + "");
            }
        }
    }
}
