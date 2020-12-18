package com.homeTest;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入18位身份证号：");
            String s = sc.next();
            boolean check = check(s);
            if (check == true) {
                System.out.println("满足条件");
                break;
            } else {
                System.out.println("您输入有误！");
                System.out.println("规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X");
            }
        }
    }

    public static boolean check(String s) {
        boolean a = true;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[0] == 0) {
                return false;
            } else if (chars[i] >= '0' && chars[chars.length - 1] <= 9) {
                a = true;
            } else if (chars[chars.length - 1] == 'X') {
                a = true;
            } else {
                a = false;
            }
        }
        return a;
    }
}
