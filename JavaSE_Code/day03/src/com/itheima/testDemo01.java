package com.itheima;

public class testDemo01 {
    public static void main(String[] args) {
        int [] arr = new int [3];
        arr [0] = 100;
        arr [1] = 200;
        arr [2] = 300;
        System.out.println(arr);
        for (int i=0;i<=2;i++){
            System.out.println(arr[i]);
        }
        int [] arr2 = arr;
        arr2 [0] = 400;
        arr2 [1] = 500;
        arr2 [2] = 600;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr2);
        for (int i=0;i<=2;i++){
            System.out.println(arr2[i]);
        }
    }
}
