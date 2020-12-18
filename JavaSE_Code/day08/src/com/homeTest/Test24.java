package com.homeTest;

import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学员数量：");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int count = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第" + (i + 1) + "名学员的成绩[0-100]");
            arr[i] = sc.nextInt();
            if (arr[i] >= 80) {
                count++;
            }
        }
        double a = count;
        double b = a / num * 100;
        System.out.println("总共录入了" + num + "名学员成绩");
        System.out.println("成绩大于等于80分的人数为：" + count);
        System.out.println("大于等于80分的学生比例为" + b + "%");
    }
}
