package com.API;
//遍历字符串输出大写字母小写字母和数字的个数

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int countA = 0;
        int counta = 0;
        int count1 = 0;
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                countA++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                counta++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                count1++;
            } else {

            }
        }
        System.out.println(countA);
        System.out.println(counta);
        System.out.println(count1);
    }
}
