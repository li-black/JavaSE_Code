package com.itheima;
//��һ����λ�����������

import java.util.Scanner;

public class TestDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println("��λ" + ge);
        System.out.println("ʮλ" + shi);
        System.out.println("��λ" + bai);
        int Newnum = ge * 100 + shi * 10 + bai;
        System.out.println(Newnum);
    }
}