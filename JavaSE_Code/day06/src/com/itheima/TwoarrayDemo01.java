package com.itheima;

//二维数组定义并打印
public class TwoarrayDemo01 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(arr);
        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][2]);
        arr[0][0] = 11;
        arr[1][1] = 11;
        arr[2][2] = 11;
        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][2]);
    }
}
