package com.homeTest;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] chars = s.toCharArray();
        int length = chars.length;
        System.out.println("该字符串长度为：" + length);
    }
}
