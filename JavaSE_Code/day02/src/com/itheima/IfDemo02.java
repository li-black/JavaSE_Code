package com.itheima;
//����ɼ��ж����Ǹ�������

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ɼ���");
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("����");
        } else if (score >= 80 && score <= 89) {
            System.out.println("����");
        } else if (score >= 70 && score <= 79) {
            System.out.println("�е�");
        } else if (score >= 60 && score <= 69) {
            System.out.println("����");
        } else if (score >= 0 && score <= 59) {
            System.out.println("��Ŭ������");
        } else {
            System.out.println("����ɼ�����");
        }
    }
}