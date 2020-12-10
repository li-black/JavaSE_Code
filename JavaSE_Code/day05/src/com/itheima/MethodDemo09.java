package com.itheima;

//定义方法bianli将数组用特定格式输出在并main方法中调用
public class MethodDemo09 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33, 44, 55};
        bianli(arr);
    }

    public static void bianli(int[] arr) {
        System.out.print("[");
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i - 1] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println("]");
    }
}
