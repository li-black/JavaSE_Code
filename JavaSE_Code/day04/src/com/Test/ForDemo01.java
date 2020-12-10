package com.Test;
/*乘法表
未知错误
Description
打印99乘法表
Input
输入一个数字n（1<=n<=9)
Output
输出n的乘法表，具体看样例，
Sample Input 1                              Sample Output 1
                                               1 * 1 = 1
        2                                  1 * 2 = 2	2 * 2 = 4*/
import java.util.Scanner;

public class ForDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(1<=n && n<=9){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " * " + i + " = " + i * j+"\t");
                }
                System.out.println();
            }
        }else{

        }
    }
}