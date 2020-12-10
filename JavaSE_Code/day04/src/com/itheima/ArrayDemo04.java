package com.itheima;
//输入年月日输出这一年已经过了几天

import java.util.Scanner;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] mounth = new int[]{-1, 31, 28, 31, 40, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int sum = 0;
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            mounth[2] = 29;
        }
        for (int i = 1; i < m; i++) {
            sum += mounth[i];
        }
        System.out.println(sum + d);
    }
}
