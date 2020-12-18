package com.homeTest;

import java.util.Random;

public class Test16 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[8];
        System.out.println("随机数组：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(61) + 5;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("小于平均值元素格式：" + getCount(arr));
    }

    public static int getCount(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println("元素平均值：" + avg);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        return count;
    }
}
