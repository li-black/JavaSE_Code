package com.homeTest;

import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入转换数据：");
            double a = sc.nextDouble();
            double trans = trans(a);
            System.out.println("求绝对值结果：" + trans);
        }
    }

    public static double trans(double a) {
        if (a < 0) {
            a = -a;
        }
        return a;
    }
}
