package com.work;

//两数互换
public class ChangeDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + " b: " + b);
    }
}
