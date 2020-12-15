package com.homeTest;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分（1-100）：");
            int score = sc.nextInt();
            if (score < 1 || score > 100) {
                System.out.println("请输入正确分数");
                i--;
            } else {
                arr[i] = score;
                sum += arr[i];
            }
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int avg = (sum - max - min) / (arr.length - 2);
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + avg);
    }
}
