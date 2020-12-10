package com.itheima;
//根据输入的分值判断小明的奖励

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩");
        int score = sc.nextInt();
        if (score >= 95 & score <= 100) {
            System.out.println("山地自行车一辆");
        } else if (score >= 90 & score <= 94) {
            System.out.println("游乐场一日游");
        } else if (score >= 80 & score <= 89) {
            System.out.println("变形金刚玩具一个");
        } else if (score >= 0 & score <= 80) {
            System.out.println("胖揍一顿");
        } else {
            System.out.println("输入成绩有误");
        }
    }
}