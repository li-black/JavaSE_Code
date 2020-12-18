package com.homeTest;

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        int countA = 0;
        while (true) {
            System.out.println("请输录入一个字符串");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int[] check = check(s);
            if (check[2] == 0) {
                System.out.println("录入有误！");
            } else {
                countA = check[0];
                break;
            }
        }
        System.out.println("大写字母有" + countA + "个");
    }

    public static int[] check(String s) {
        int count = 0;
        int counta = 0;
        int countA = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                counta++;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                countA++;
            }
        }
        count = countA + counta;
        int[] arr = new int[]{countA, counta, count};
        return arr;
    }
}
