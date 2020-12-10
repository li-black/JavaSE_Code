package com.itheima;

//定义带参方法check如果num为偶数输出true,否则输出false,在main方法中调用check方法
public class MethodDemo14 {
    public static void main(String[] args) {
        boolean a = check(27);
        System.out.println(a);
    }

    public static boolean check(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
