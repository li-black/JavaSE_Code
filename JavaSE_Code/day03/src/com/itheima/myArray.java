package com.itheima;

//输出arr地址并遍历打印arr,输出arr1地址并遍历打印arr1,改变arr与arr1的数据并再次遍历打印
public class myArray {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int[] arr2 = new int[3];
        System.out.println(arr);
        for (int i = 0; i <= 1; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr2);
        for (int i = 0; i <= 2; i++) {
            System.out.println(arr2[i]);
        }
        arr[0] = 100;
        arr[1] = 200;
        arr2[2] = 300;
        System.out.println(arr);
        for (int i = 0; i <= 1; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr2);
        for (int i = 0; i <= 2; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println(10 / 20.0);
    }
}
