package com.itheima;

//debug测试
public class DebugDemo02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 6; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
