package com.itheima;

//字符码表
public class TestDemo02 {
    public static void main(String[] args) {
        int b = 'a';
        System.out.println(b);
        char c = (char) ('a' + 15);
        System.out.println(c);
        System.out.println("Hello" + 1 + 2 + 3);
        System.out.println(1 + 2 + 3 + "Hello");
        b += 1;
        System.out.println(b);
    }
}