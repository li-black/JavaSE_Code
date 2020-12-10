package com.itheima;

//定义一个double类型的数组并且遍历输出最小值
public class ArrayDemo10 {
    public static void main(String[] args) {
        double[] arr = new double[]{12.9, 53.54, 75.0, 99.1, 3.14};
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
