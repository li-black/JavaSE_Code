package com.itheima;
//用随机数创建长度为6的数组并且遍历数组输出总和

import java.util.Random;

public class arrayDemo09 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(101);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
