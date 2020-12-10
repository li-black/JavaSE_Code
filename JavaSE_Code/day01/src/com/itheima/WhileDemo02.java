package com.itheima;

//定于一张0.1厚的纸判断对折多少次后能达到珠穆朗玛峰的高度
public class WhileDemo02 {
    public static void main(String[] args) {
        int count = 0;
        float i = 0.1F;
        while (i <= 8844430) {
            i = i * 2;
            count++;
        }
        System.out.println(count);
    }
}