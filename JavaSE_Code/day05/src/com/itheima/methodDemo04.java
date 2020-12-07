package com.itheima;

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
