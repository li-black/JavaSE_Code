package com.Test;
/*回文数
Description
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
Input
输入仅包含一个字符串
Output
如果是回文数，输出true，否则输出false
Sample Input 1                          Sample Output 1
      121                                   true
Sample Input 2                          Sample Output 2
      10                                    false*/

import java.util.Scanner;

public class testDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b = 0;
        int c = 0;
        b = num;
        while (b > 0) {
            c = c * 10 + b % 10;
            b = b / 10;
        }
        if (c == num) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}