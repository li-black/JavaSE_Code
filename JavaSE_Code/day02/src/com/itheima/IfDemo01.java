package com.itheima;
//���������ж���ż

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("ż��");
        }
        if (a % 2 == 1) {
            System.out.println("����");
        }
    }
}