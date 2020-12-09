package com.itheima;

//定义数组arr01并遍历输出默认值,然后在数组中添加数字再次遍历输出
public class arrayDemo03 {
    public static void main(String[] args) {
        int[] arr01 = new int[3];
        for (int i = 0; i < arr01.length; i++) {
            System.out.println(arr01[i]);
        }
        arr01[0] = 11;
        arr01[1] = 15;
        arr01[2] = 18;
        for (int i = 0; i < arr01.length; i++) {
            System.out.println(arr01[i]);
        }
    }
}