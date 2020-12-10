package com.itheima;

//遍历二维数组
public class TwoarrayDemo02 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{11, 22, 33}, {55, 66, 77}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
