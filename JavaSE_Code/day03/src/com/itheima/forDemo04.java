package com.itheima;

//算出1到100之间的奇数且能被3和7整除的数的和
public class forDemo04 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1 && i % 3 == 0 && i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
