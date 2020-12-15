package com.homeTest;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("请输入起始数据：");
            int start = sc.nextInt();
            System.out.println("请输入结束数据：");
            int end = sc.nextInt();
            if (start == end) {
                System.out.println("输入有误！");
                i--;
            } else {
                int sum = getSum(start, end);
                System.out.println(start + "到" + end + "之间数据和为：" + sum);
            }
        }
    }

    public static int getSum(int start, int end) {
        int sum = 0;
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
