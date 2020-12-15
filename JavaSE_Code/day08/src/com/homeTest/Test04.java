package com.homeTest;

import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        Random r = new Random();
        int r1 = r.nextInt(91) + 10;
        int count = 0;
        System.out.println("随机数：" + r1);
        for (int i = 10; i <= r1; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("10到" + r1 + "之间的奇数有：" + count + "个");
    }
}
