package com.itheima;

public class arrayDemo11 {
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
