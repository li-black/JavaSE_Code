package com.itheima;
//�ж���������Ƿ���ż��

import java.util.Scanner;

public class IfTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ������");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + "��ż��");
        } else {
            System.out.println(number + "������");
        }
    }
}