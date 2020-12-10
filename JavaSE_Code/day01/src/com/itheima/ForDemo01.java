package com.itheima;

//输出1到5和5到1
public class ForDemo01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("------");
        for (int a = 5; a >= 1; a--) {
            System.out.println(a);
        }
    }
}
