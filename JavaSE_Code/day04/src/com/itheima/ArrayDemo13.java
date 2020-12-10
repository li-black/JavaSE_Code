package com.itheima;
//评委打分,去掉一个最底值,去掉一个最高值,结果取平均值

import java.util.Scanner;

public class ArrayDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分:");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
            } else {
                System.out.println("您输入分数不在0-100区间内,请重新输入:");
                i--;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        int avg = (sum - max - min) / (arr.length - 2);
        System.out.println("选手的最终得分是" + avg + "分");
    }
}