package com.itheima;

//�ж��������е����ֵ
public class OperatorTest01 {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        int tempHeight = height1 > height2 ? height1 : height2;
        int MaxHeight = tempHeight > height3 ? tempHeight : height3;
        System.out.println("��ߵ�����" + MaxHeight + "cm");
    }
}