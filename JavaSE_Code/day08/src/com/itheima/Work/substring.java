package com.itheima.Work;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.substring(0, 3);
        String s2 = s.substring(7);
        System.out.println(s1 + "****" + s2);
    }
}
