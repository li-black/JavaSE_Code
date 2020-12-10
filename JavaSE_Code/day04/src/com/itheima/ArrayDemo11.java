package com.itheima;

//定义数组arr01,之后定义数组arr02,将arr01中中的奇数放在左边,偶数放在右边
public class ArrayDemo11 {
    public static void main(String[] args) {
        int[] arr01 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr02 = new int[arr01.length];
        int a = 0;
        int b = arr01.length - 1;
        for (int i = 0; i < arr01.length; i++) {
            if (arr01[i] % 2 == 1) {
                arr02[a] = arr01[i];
                a++;
            } else {
                arr02[b] = arr01[i];
                b--;
            }
        }
        for (int i = 0; i < arr02.length; i++) {
            System.out.print(arr02[i] + " ");
        }
    }
}
