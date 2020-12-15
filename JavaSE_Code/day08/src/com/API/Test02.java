package com.API;

//将数组输出为字符串格式
public class Test02 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        String s = arrayToString(arr);
        System.out.println(s);
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
                sb.append("]");
            } else {
                sb.append(arr[i]);
                sb.append(",");
            }
        }
        String s = sb.toString();
        return s;
    }
}
