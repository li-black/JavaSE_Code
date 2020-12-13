package com.itheima.Test;

import java.util.Scanner;

/*
1.已知一个数组arr = {19, 28, 37, 46, 50}; 键盘录入一个整数并接收
2.定义一个方法，完成查找该整数（录入的整数）在数组（arr）中的索引，并在控制台打印找到的索引值
3.main方法中判断，如果数据不是该数组中的元素，给出提示
*/
public class Test03 {
    public static void main(String[] args) {
        int[] arr = new int[]{19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n = sc.nextInt();
        getFind(arr, n);
    }

    public static void getFind(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("你输入的" + n + ", 在数组中索引为" + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("数组元素不包含你输入的数据");
        }
    }
}
