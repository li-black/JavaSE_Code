package com.homeTest;

public class Test22 {
    public static void main(String[] args) {
        int[] arr = new int[]{22, 56, 8, 97, 99, 46, 53, 2, 13};
        int start = 0;
        int end = arr.length - 1;
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr1[end] = arr[i];
                end--;
            } else {
                arr1[start] = arr[i];
                start++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
