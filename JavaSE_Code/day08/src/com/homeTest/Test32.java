package com.homeTest;

public class Test32 {
    public static void main(String[] args) {
        int[] randomArray = ArrayTools.getRandomArray(10, 10, 80);
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();
        System.out.println("sum：" + ArrayTools.getArraySum(randomArray));
        System.out.println("max：" + ArrayTools.getArrayMax(randomArray));
        System.out.println("min：" + ArrayTools.getArrayMin(randomArray));
        System.out.println("avg：" + ArrayTools.getArrayAvg(randomArray));
        int exist = ArrayTools.isExist(randomArray, 58);
        if (exist == -1) {
            System.out.println("该数组中不包含元素：" + 58);
        } else {
            System.out.println(58 + "索引为" + exist);
        }
        int[] reverse = ArrayTools.reverse(randomArray);
        System.out.println("翻转后的数组元素：");
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
        System.out.println();
    }
}
