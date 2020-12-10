package com.itheima;
//根据输入输出月份

import java.util.Scanner;

public class ChunDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份:");
        int mouth = sc.nextInt();
        switch (mouth) {
            case 1:
            case 2:
            case 3:
                System.out.println("这个月份属于春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("这个月份属于夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("这个月份属于秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("这个月份属于冬季");
                break;
            default:
                System.out.println("输入数据有误");
                break;
        }
    }
}