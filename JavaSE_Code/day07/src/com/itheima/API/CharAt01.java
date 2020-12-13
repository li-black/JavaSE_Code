package com.itheima.API;
//获取字符串长度遍历字符串

import java.util.Scanner;

public class CharAt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
    }
}
