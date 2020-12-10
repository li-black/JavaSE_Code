package com.itheima;

//算出1到100之间能被3整除的数的个数
public class ForDemo05 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
//                System.out.println(i);
                count += 1;
            }
        }
        System.out.println(count);
    }
}
