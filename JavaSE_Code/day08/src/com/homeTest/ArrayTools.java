package com.homeTest;

import java.util.Random;

public class ArrayTools {
    public static int[] getRandomArray(int length, int min, int max) {
        Random r = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(max - min + 1) + 1;
        }
        return arr;
    }

    public static int getArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getArrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getArrayMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getArrayAvg(int[] arr) {
        int arraySum = getArraySum(arr);
        int avg = arraySum / arr.length;
        return avg;
    }

    public static int isExist(int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
            }
        }
        return index;
    }

    public static int[] reverse(int[] arr) {
        int[] arr1 = new int[arr.length];
        int a = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[a] = arr[i];
            a++;
        }
        return arr1;
    }
}
