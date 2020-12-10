package com.itheima;
//打印出来输入的数

import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("x:" + x);
    }
}