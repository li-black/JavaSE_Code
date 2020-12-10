package com.itheima;

/*
用于统计100到1000中水仙花数有多少个
*/
public class CountDemo01 {
    public static void main(String[] args) {
        //定义变量count,用于保存水仙花数的个数，初始值为0
        int count = 0;
        //for循环遍历所有的三位数，从100开始，999结束
        for (int i = 100; i <= 1000; i++) {
            //获取三位数中每位上的数字
            int j = i % 10;
            int k = i / 10 % 10;
            int l = i / 10 / 10 % 10;
            //判断这个数是否是水仙花数，如果是则让count加一
            if (j * j * j + k * k * k + l * l * l == i) {
                count += 1;
            }
        }
        //打印最终输出结果
        System.out.println("水仙花数一共有" + count + "个");
    }
}