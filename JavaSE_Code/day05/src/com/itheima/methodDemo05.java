package com.itheima;

import java.util.Scanner;

//方法重载
public class methodDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(dengyu(n, m));
    }

    public static boolean dengyu(byte n, byte m) {
        return n == m;
    }

    public static boolean dengyu(int n, int m) {
        return n == m;
    }

    public static boolean dengyu(short n, short m) {
        return n == m;
    }

    public static boolean dengyu(long n, long m) {
        return n == m;
    }
}