package com.itheima;

//遍历二维数组求和
public class TwoarrayDemo03 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{11, 22, 33}, {55, 66, 77}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}