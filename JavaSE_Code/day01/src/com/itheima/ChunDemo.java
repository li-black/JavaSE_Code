package com.itheima;
//������������·�

import java.util.Scanner;

public class ChunDemo {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        Scanner sc = new Scanner(System.in);
        System.out.println("�������·�:");
        int mouth = sc.nextInt();
        switch (mouth) {
            case 1:
            case 2:
            case 3:
                System.out.println("����·����ڴ���");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("����·������ļ�");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("����·������＾");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("����·����ڶ���");
                break;
            default:
                System.out.println("������������");
                break;
        }
    }
}