package com.itheima;

public class methodDemo09 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33, 44, 55};
        bianli(arr);
        System.out.println("123456");
    }

    public static void bianli(int[] arr) {
        System.out.print("[");
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i - 1] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println("]");
    }
}
