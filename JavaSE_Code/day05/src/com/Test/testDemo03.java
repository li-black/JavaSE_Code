package com.Test;
/*小明的选择
Description
小明受邀参加朋友的晚会Part，形式为自助餐，
已经目前有N种食物编号1-N依次摆放在一行，小明可以从中挑选食物，但必须符合以下条件
*如果选中了某个编号为X的食物，则两边的食物不能选中（即x-1，x+1的食物不能选）
*小明可以选择任意个食物
请帮助计算，在给定食物数量N的前提下，小明一共有多少种选择！
Input
输入一个整数N，表示食物的数量(N<20）
Output
输出小明有多少种选择
Sample Input 1                              Sample Output 1
      1                                            2
Hint
如果只有编号1的食物，小明可以选择编号1的食物，也可以不选择任何食物，共两种选择方案*/

import java.util.Scanner;

public class testDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        if (n < 3 && n > 0) {
            arr[0] = 2;
            arr[1] = 3;
            System.out.println(arr[n - 1]);
        } else if (n >= 3) {
            arr[0] = 2;
            arr[1] = 3;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.println(arr[n - 1]);
        } else {
        }
    }
}