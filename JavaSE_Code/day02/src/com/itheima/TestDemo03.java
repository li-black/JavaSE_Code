package com.itheima;
//将一个三位数倒过来输出

import java.util.Scanner;

public class TestDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println("个位" + ge);
        System.out.println("十位" + shi);
        System.out.println("百位" + bai);
        int Newnum = ge * 100 + shi * 10 + bai;
        System.out.println(Newnum);
    }
}