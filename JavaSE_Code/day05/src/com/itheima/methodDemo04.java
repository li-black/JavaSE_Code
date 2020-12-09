package com.itheima;
//键盘输入两个数定义bigger方法返回最大值并打印

import java.util.Scanner;

public class methodDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = bigger(n, m);
        System.out.println(max);
    }

    public static int bigger(int n, int m) {
        if (n > m) {
            return n;
        } else {
            return m;
        }
    }
}
