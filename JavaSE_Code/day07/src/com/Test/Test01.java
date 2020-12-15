package com.Test;
/*
1.获取一个[10,100]之间的int类型随机整数num，统计[10,num]之间，奇数的个数
 2.最终在控制台打印所有的奇数，和个数
 */

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(91) + 10;
        int count = 0;
        System.out.println("随机数num: " + num);
        for (int i = 10; i <= num; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("10到" + num + "之间奇数的个数为: " + count);
    }
}
