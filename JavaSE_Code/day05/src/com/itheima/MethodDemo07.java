package com.itheima;

//了解方法change中的数组的值改变main中的数组的值会不会跟着改变,结果会改变
public class MethodDemo07 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30};
        System.out.println(arr[1]);
        change(arr);
        System.out.println(arr[1]);
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
