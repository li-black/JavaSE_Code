package com.itheima;

//�ж�a�Ƿ����b
public class IfDemo02 {
    public static void main(String[] args) {
        System.out.println("��ʼ");//������������
        int a = 10;
        int b = 20;
        b = 5;//�����ж�a�Ƿ����b������ǣ��ڿ���̨�����a��ֵ����b�������ڿ���̨�����a��ֵ������b
        if (a > b) {
            System.out.println("a��ֵ����b");
        } else {
            System.out.println("a��ֵ������b");
        }
        System.out.println("����");
    }
}