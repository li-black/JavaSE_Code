package com.itheima;

import java.util.Scanner;

public class printDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        print(n, m);
    }

    public static void print(int n, int m) {
        if (n <= m) {
        } else {
//            return;
            int a = n;
            n = m;
            m = a;
        }
        System.out.println(n + "到" + m + "之间的奇数是:");
        for (int i = n; i <= m; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
