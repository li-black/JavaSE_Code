package com.itheima;

public class methodDemo07 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
