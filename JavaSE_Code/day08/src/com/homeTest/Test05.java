package com.homeTest;

public class Test05 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 5 != 0 && i / 10 != 5 && i / 100 != 5) {
                System.out.print(i + " ");
                count++;
                if (count % 6 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
