package com.itheima;

/*
����ͳ��100��1000��ˮ�ɻ����ж��ٸ�
*/
public class CountDemo01 {
    public static void main(String[] args) {
        //�������count,���ڱ���ˮ�ɻ����ĸ�������ʼֵΪ0
        int count = 0;
        //forѭ���������е���λ������100��ʼ��999����
        for (int i = 100; i <= 1000; i++) {
            //��ȡ��λ����ÿλ�ϵ�����
            int j = i % 10;
            int k = i / 10 % 10;
            int l = i / 10 / 10 % 10;
            //�ж�������Ƿ���ˮ�ɻ��������������count��һ
            if (j * j * j + k * k * k + l * l * l == i) {
                count += 1;
            }
        }
        //��ӡ����������
        System.out.println("ˮ�ɻ���һ����" + count + "��");
    }
}