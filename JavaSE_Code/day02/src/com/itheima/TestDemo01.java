package com.itheima;
//�������������������������㲢�����Ǯ

import java.util.Scanner;

public class TestDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��������������������");
        int tomato = sc.nextInt();
        System.out.println("������������������");
        int potato = sc.nextInt();
        double sum = tomato * 2.3 + potato * 1.5;
        System.out.println("���������������ܼ��ǣ�" + sum + "Ԫ");
    }
}