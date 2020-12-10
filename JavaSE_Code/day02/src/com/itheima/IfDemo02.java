package com.itheima;
//输入成绩判断在那个区间内

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score <= 89) {
            System.out.println("良好");
        } else if (score >= 70 && score <= 79) {
            System.out.println("中等");
        } else if (score >= 60 && score <= 69) {
            System.out.println("及格");
        } else if (score >= 0 && score <= 59) {
            System.out.println("请努力加油");
        } else {
            System.out.println("输入成绩有误");
        }
    }
}