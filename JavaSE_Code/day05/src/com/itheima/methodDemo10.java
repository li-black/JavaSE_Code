package com.itheima;

public class methodDemo10 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99};
        int[] maxandmin=getmaxandmin(arr);
        System.out.println(maxandmin[0]);
        System.out.println(maxandmin[1]);
    }

    public static int[] getmaxandmin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int [] maxandmin = new int[]{max, min};
        return maxandmin;
    }
}