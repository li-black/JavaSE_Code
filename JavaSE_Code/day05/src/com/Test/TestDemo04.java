package com.Test;
/*素数判定
Description
给你两个数a、b,判断这两个数组成的区间内共有多少个素数
Input
输入两个数a、b
Output
输出该区间内素数的个数
Sample Input 1                                  Sample Output 1
      1
      2                                                1
Sample Input 2                                  Sample Output 2
      1
     100                                              25*/

import java.util.Scanner;

public class TestDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        int[] arr = new int[b - a + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a++;
        }
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            boolean flag = true;
            if (c == 1) {
                continue;
            } else if (c == 2) {
                count++;
            } else {
                for (int j = 2; j < c; j++) {
                    if (c % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
