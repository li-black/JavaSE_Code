package com.itheima;
//�ֶ�������������������ֵ

import java.util.Scanner;

public class ThreePeoplelvup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ���˵����");
        int height1 = sc.nextInt();
        System.out.println("������ڶ����˵����");
        int height2 = sc.nextInt();
        System.out.println("������������˵����");
        int height3 = sc.nextInt();
        int mid = height1 > height2 ? height1 : height2;
        int max = mid > height3 ? mid : height3;
        System.out.println("���������������ߵ��ǣ�" + max + "cm");
    }
}