package com.homeTest;

public class Test06 {
    public static void main(String[] args) {
        for (int i = 1988; i <= 2019; i++) {
            if (i % 4 == 0 && i % 100 != 0) {
                System.out.println(i + "是闰年");
            } else if (i % 400 == 0) {
                System.out.println(i + "是闰年");
            }
        }
    }
}
