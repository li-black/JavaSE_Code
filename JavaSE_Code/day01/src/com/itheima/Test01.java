package com.itheima;
//��������ķ�ֵ�ж�С���Ľ���

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������С���ĳɼ�");
        int score = sc.nextInt();
        if (score >= 95 & score <= 100) {
            System.out.println("ɽ�����г�һ��");
        } else if (score >= 90 & score <= 94) {
            System.out.println("���ֳ�һ����");
        } else if (score >= 80 & score <= 89) {
            System.out.println("���ν�����һ��");
        } else if (score >= 0 & score <= 80) {
            System.out.println("����һ��");
        } else {
            System.out.println("����ɼ�����");
        }
    }
}