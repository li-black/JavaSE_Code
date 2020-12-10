package com.itheima;

//定义二维数组并且遍历求和
public class ArrayDemo02 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arr = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
