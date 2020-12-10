package com.itheima;

//水仙花数判断
public class ShuixianDemo01 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int j = i % 10;
            int k = i / 10 % 10;
            int l = i / 10 / 10 % 10;
            if (j * j * j + k * k * k + l * l * l == i) {
                System.out.println(i);
            }
        }
    }
}