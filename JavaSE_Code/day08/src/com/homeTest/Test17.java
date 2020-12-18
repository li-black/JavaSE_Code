package com.homeTest;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99, 10};
        int a = 5;
        int b = 1;
        change(arr, a, b);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void change(int[] arr, int a, int b) {
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
