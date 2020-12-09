package com.itheima;
//定义方法print能够将输入的n到m区间的奇数全部输出,并在main方法中掉用print方法,数值来自键盘录入

import java.util.Scanner;

public class printDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        print(n, m);
    }

    public static void print(int n, int m) {
        if (n <= m) {
        } else {
//            return;
            int a = n;
            n = m;
            m = a;
        }
        System.out.println(n + "到" + m + "之间的奇数是:");
        for (int i = n; i <= m; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
