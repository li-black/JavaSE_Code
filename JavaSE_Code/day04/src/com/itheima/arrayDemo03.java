package com.itheima;

public class arrayDemo03 {
    public static void main(String[] args) {
        int[] arr01 = new int[3];
        System.out.println(arr01);
        arr01:
        for (int i = 0; i < arr01.length; i++) {
            System.out.println(arr01[i]);
        }
        arr01[0] = 11;
        arr01[1] = 15;
        arr01[2] = 18;
        for (int i = 0; i < arr01.length; i++) {
            System.out.println(arr01[i]);
        }
    }
}