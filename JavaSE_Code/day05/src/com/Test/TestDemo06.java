package com.Test;
/*数字翻转
Description
对于一个整数X，定义操作rev(X)为将X按数位翻转过来，并且去除掉前导0。
例如:
如果 X = 123，则rev(X) = 321
如果 X = 100，则rev(X) = 1
现在给出整数x和y,要求rev(rev(x) + rev(y))为多少？
Input
输入为一行，x、y(1 ≤ x、y ≤ 1000)，以空格隔开。
Output
输出rev(rev(x) + rev(y))的值
Sample Input 1                          Sample Output 1
   123 100                                   223*/

import java.util.Scanner;

public class TestDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = 0;
        if (x >= 1 && y <= 1000) {
            a = rev(rev(x) + rev(y));
            System.out.println(a);
        } else {

        }
    }

    public static int rev(int n) {
        int b = 0;
        int c = n;
        while (c > 0) {
            b = b * 10 + c % 10;
            c = c / 10;
        }
        return b;
    }
}
