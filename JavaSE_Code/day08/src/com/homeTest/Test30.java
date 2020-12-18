package com.homeTest;

import java.util.Scanner;

public class Test30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sort = sort(arr);
        int[] one = one(sort);
        System.out.println("只出现一次的元素包括");
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i] + " ");
        }
        System.out.println();
        System.out.println("数组中只出现一次的元素数量为：" + one.length);
    }

    public static int[] sort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int[] arr1 = new int[arr.length];
        System.out.println("原数组元素：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr1[start] = arr[i];
                start++;
            } else {
                arr1[end] = arr[i];
                end--;
            }
        }
        System.out.println("新数组元素：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        return arr1;
    }

    public static int[] one(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {

                } else if (start == arr[j]) {
                    count++;
                    continue;
                }
            }
        }
        int[] arr1 = new int[arr.length - count];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i];
            int b = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {

                } else if (start == arr[j]) {
                    b++;
                    continue;
                }
            }
            if (b == 0) {
                arr1[a] = arr[i];
                a++;
            } else {

            }
        }
        return arr1;
    }
}
