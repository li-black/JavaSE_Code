package com.homeTest;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个带数字和字母的字符串：");
        String s = sc.next();
        char[] chars = s.toCharArray();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= '9' && chars[i] >= '0') {
                s1.append(chars[i]);
            } else {
                s2.append(chars[i]);
            }
        }
        StringBuilder append = s1.append(s2);
        String s3 = append.toString();
        System.out.println(s3);
    }
}
