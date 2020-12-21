package com.heima.Test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(99) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int score = getScore(arr);
        System.out.println(score);
    }

    public static int getScore(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }
        return count;
    }
}
