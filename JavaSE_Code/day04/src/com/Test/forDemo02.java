package com.Test;
/*倒序输出一个正整数
Description
给定一个正整数n，请尽可能利用递归实现倒序输出
Input
输入一个正整数n
Output
倒序输出正整数
Sample Input 1                                      Sample Output 1
    12345                                               54321*/
import java.util.Scanner;

public class forDemo02 {
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
        System.out.println(c);
    }
}