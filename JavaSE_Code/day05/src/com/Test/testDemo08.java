package com.Test;
/*懂二进制
Description
世界上有10种人，一种懂二进制，一种不懂。那么你知道两个int类型整数m和n的二进制表达，有多少个位(bit)不同么？
Input
输入为一行，包含两个int类型的整数，以空格隔开
Output
输出两个二进制数字中，bit位不相同的个数
Sample Input 1                                   Sample Output 1
      2 3                                              1*/

import java.util.Scanner;

public class testDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int a = n ^ m;
        int c = a;
        int sum = 0;
        while (c > 0) {
            c = c / 2;
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a % 2;
            a = a / 2;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
