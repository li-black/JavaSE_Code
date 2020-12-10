package com.Test;
//未提交
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
/*
Description
给定一个长度为n的数组，请将数组中元素按照奇偶性重新划分，
所有奇数靠左边，所有偶数靠右边，然后分别对奇数、偶数部分进行排序
请尽可能实现通过一次遍历并且原地操作（即不得借助其他数组）进行奇偶划分。
Input
输入有两行，第一行输入一个数字n表示数组的长度，
第二行依次输入n个数字，表示数组的元素值。
Output
打印按照奇偶排列并各自排序后的新数组，元素之间用空格隔开
Sample Input 1
      5                             Sample Output 1
  2 1 5 4 3                           1 3 5 2 4*/
public class SortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //定义一个长度为n的数组，然后键盘录入数组的元素
        System.out.println("输入数组长度：");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("依次输入数组元素：");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //定义两个指针
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            //从头开始寻找奇数，并记录位置
            while (start < n && arr[start] % 2 == 1) {
                start++;
            }
            //从尾卡开始寻找偶数,并记录位置
            while (end >= 0 && arr[end] % 2 == 0) {
                end--;
            }
            //奇偶数交换位置,前面与后面交换
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        //冒泡排序,先排序奇数
        for (int i = 0; i < start - 1; i++) {
            for (int j = start - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    //调换arr【j】与【j+1】的位置
                    int max = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = max;
                }
            }
        }
        //排序偶数
        for (int i = start; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    //调换arr【j】与【j-1】的位置
                    int Min = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = Min;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
