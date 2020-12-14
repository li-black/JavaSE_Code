package com.itheima.Work;

import java.util.Scanner;

public class stringreplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.replace("TMD", "***");
        System.out.println(s1);
    }
}
