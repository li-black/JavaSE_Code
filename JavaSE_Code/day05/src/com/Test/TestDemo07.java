package com.Test;
/*寻找峰值
Description
峰值元素是指其值大于左右相邻值的元素。
给定一个输入数组nums，其中nums[i] ≠ nums[i+1]，
找到峰值元素并输出其索引值，你可以假设nums[-1] = nums[n] = -∞。
注意：不用担心存在多个峰值，测试数据保证仅存在一个峰值
Input
输入一个整数n，表述数组的长度，接下来依次输入n个数字，表示数组元素的值
Output
输出该数组峰值对应的索引位置
Sample Input 1                          Sample Output 1
      6
 1 8 9 10 7 5                                  3
Hint
二分*/

import java.util.Scanner;

public class TestDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println(left);
    }
}
