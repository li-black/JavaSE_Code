package com.itheima.API;
//通过StringBulider判断输入的字符串是否是对称字符串
//注意StringBuilder与String不能直接转换

import java.util.Scanner;

public class StringBuilder01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();
        if (s.equals(s1)) {
            System.out.println("是对称数");
        } else {
            System.out.println("不是对称数");
        }
    }
}
