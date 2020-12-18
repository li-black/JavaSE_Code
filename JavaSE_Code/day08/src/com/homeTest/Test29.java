package com.homeTest;

import java.util.Scanner;

public class Test29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个字符串：");
        String s = sc.next();
        char[] trans = trans(s);
        char[] trans1 = trans1(trans);
        for (int i = 0; i < trans1.length; i++) {
            System.out.print(trans1[i] + " ");
        }
    }

    public static char[] trans(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static char[] trans1(char[] arr) {
        if (arr[0] != arr[arr.length - 1]) {
            char temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 'Z' && arr[i] >= 'A') {
                arr[i] = (char) (arr[i] + 32);
                if (i % 2 == 1) {
                    arr[i] = '~';
                }
            }
        }
        return arr;
    }
}
