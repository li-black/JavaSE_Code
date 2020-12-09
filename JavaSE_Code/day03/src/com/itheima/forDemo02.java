package com.itheima;

//算出1到10之间的乘积
public class forDemo02 {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println("1到10的乘积是" + product);
    }
}
