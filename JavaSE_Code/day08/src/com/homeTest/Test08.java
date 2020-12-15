package com.homeTest;

public class Test08 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 9999; i >= 1000; i--) {

            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            int qian = i / 10 / 10 / 10 % 10;
            if (ge + bai == shi + qian) {
                System.out.print(i + " ");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
