package com.homeTest;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int r1 = r.nextInt(100) + 1;
        System.out.println("正确答案：" + r1);
        while (true) {
            System.out.println("请输入您猜的数字（1-100）");
            int num = sc.nextInt();
            if (num == r1) {
                System.out.println("恭喜你！猜对了~");
                break;
            } else if (num > r1) {
                System.out.println("猜大了！");
            } else if (num < r1) {
                System.out.println("猜小了！");
            }
        }
    }
}
