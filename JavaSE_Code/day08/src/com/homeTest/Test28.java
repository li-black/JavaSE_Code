package com.homeTest;

import java.util.Scanner;

public class Test28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的手机号码：");
            String s = sc.next();
            boolean check = check(s);
            if (check == false) {
                System.out.println("您输入的号码有误，请重新输入");
            } else {
                System.out.println("录入正确，感谢注册！");
                break;
            }
        }
    }

    public static boolean check(String s) {
        char[] chars = s.toCharArray();
        if (chars.length != 11) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[0] != '1') {
                return false;
            } else if (chars[i] <= '9' && chars[i] >= '0') {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
