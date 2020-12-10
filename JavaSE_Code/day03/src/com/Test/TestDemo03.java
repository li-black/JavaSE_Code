package com.Test;
/*阶乘求和
Description
求Sn=1!+2!+3!+4!+5!+…+n!之值，其中n是一个数字（n<12)
Input
输入一个正整数n（n<12)
Output
输出Sn的值
Sample Input 1                          Sample Output 1
       5                                    153*/

import java.util.Scanner;

public class TestDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int a = 1;
        int b = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= b; j++) {
                a *= j;
            }
            sum += a;
            a = 1;
            b--;
        }
        System.out.println(sum);
    }
}