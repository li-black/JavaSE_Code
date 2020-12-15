package com.API;

import java.util.Scanner;

//字符串替换
public class Stringreplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String s = sc.nextLine();
        String s1 = s.replace("TMD", "***");
        System.out.println(s1);
    }
}
