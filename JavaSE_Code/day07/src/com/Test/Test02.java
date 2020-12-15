package com.Test;
/*
1.控制台提示并键盘录入，总共6个评委打分，分数为[1-100]之间的int类型整数
2.分别定义三个方法，完成获取该选手的最高分、最低分、和平均分（去掉最高分、去掉最低分后）
3.在main方法中分别调用三个方法，打印结果
*/

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分");
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("输入有误");
                i--;
            } else {
                arr[i] = score;
            }
        }
        System.out.println("最高分: " + getMax(arr));
        System.out.println("最低分: " + getMin(arr));
        System.out.println("平均分: " + getAvg(arr));
    }

    public static int getMax(int[] arr) {
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        return Max;
    }

    public static int getMin(int[] arr) {
        int Min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }
        return Min;
    }

    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int max = getMax(arr);
        int min = getMin(arr);
        int avg = (sum - max - min) / (arr.length - 2);
        return avg;
    }
}
