package com.itheima;

//判断三个数的最大值
public class ThreeDemo01 {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        int midheight = height1 > height2 ? height1 : height2;
        int maxheight = midheight > height3 ? midheight : height3;
        System.out.println("最高身高为：" + maxheight + "cm");
    }
}