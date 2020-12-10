package com.Test;
/*青蛙跳台阶
Description
一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个n级的台阶总共有多少种跳法。
Input
输入一个正整数n（n<39)
Output
输出青蛙有多少种跳法
Sample Input 1                          Sample Output 1
      2                                       2*/

import java.util.Scanner;

public class TestDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        if (n < 3 && n > 0) {
            arr[0] = 1;
            arr[1] = 2;
            System.out.println(arr[n - 1]);
        } else if (n >= 3) {
            arr[0] = 1;
            arr[1] = 2;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.println(arr[n - 1]);
        } else {
        }
    }
}
