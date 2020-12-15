package com.homeTest;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{19, 28, 37, 46, 50};
        System.out.println("请输入要查找的元素：");
        int num = sc.nextInt();
        int search = search(arr, num);
        if (search == -1) {
            System.out.println("数组中不包含该元素");
        } else {
            System.out.println(num + "在数组中的索引为：" + search);
        }
    }

    public static int search(int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
            }
        }
        return index;
    }
}
