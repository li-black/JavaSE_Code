package com.itheima;

//方法参数传递的为引用数据类型:传入方法的,是内存地址
public class methodDemo16 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
