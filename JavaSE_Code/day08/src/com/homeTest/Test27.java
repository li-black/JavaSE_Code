package com.homeTest;

import java.util.Random;

public class Test27 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newarr = new int[3];
        int sum = 0;
        System.out.print("随机索引为：");
        for (int i = 0; i < newarr.length; i++) {
            int num = r.nextInt(10);
            newarr[i] = arr[num];
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("新数组元素为：");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
            sum += newarr[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}
