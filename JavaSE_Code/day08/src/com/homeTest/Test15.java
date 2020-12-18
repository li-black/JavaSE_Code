package com.homeTest;

import java.util.Random;

public class Test15 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        System.out.println("随机数组");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("max:" + getMax(arr));
        System.out.println("min:" + getMin(arr));
        System.out.println("avg:" + getAvg(arr));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        return avg;
    }
}
