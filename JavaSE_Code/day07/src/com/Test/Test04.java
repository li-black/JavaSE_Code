package com.Test;

import java.util.Random;

/*
1.定义一个方法getCount(int[] arr) ，获取一个指定数组中，小于数组元素平均值的元素的个数并返回
2.在main方法中，使用随机数给一个长度为8的int类型数组赋值，元素数据范围为[7,78]
3.调用getCount()方法，传递数组，接收返回值（小于数组元素平均值的元素的个数）并打印
*/
public class Test04 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(72) + 7;
        }
        int num = getCount(arr);
        System.out.println("低于元素平均值的元素个数: " + num);
    }

    public static int getCount(int[] arr) {
        int sum = 0;
        int count = 0;
        System.out.println("随机数组:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println();
        int avg = sum / arr.length;
        System.out.println("数组元素平均值: " + avg);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        return count;
    }
}
