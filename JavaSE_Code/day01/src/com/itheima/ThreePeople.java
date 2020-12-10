package com.itheima;

//输出三个值中的最大值
public class ThreePeople {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        int mid = height1 > height2 ? height1 : height2;
        int max = mid > height3 ? mid : height3;
        System.out.println("max:" + max);
    }
}