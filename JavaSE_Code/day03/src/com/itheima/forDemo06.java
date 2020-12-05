package com.itheima;

import java.util.Scanner;

public class forDemo06 {
    public static void main(String[] args) {
        int count = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d = num;
        while(d > 0){
            c = c * 10 + d % 10;
            d /= 10;
            count ++;
        }
        System.out.println(count);
        System.out.println(c);
    }
}
