package com.Work;
//字符统计

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int countA = 0;
        int counta = 0;
        int countnum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 'Z' && chars[i] >= 'A') {
                countA++;
            } else if (chars[i] <= 'z' && chars[i] >= 'a') {
                counta++;
            } else if (chars[i] <= '9' && chars[i] >= '0') {
                countnum++;
            }
        }
        System.out.println("大写字母个数为" + countA);
        System.out.println("小写字母个数为" + counta);
        System.out.println("数字个数为" + countnum);
    }
}
