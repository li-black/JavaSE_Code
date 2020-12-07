package com.Test;
/*数字的秘密
Description
在数字王国中，人人都有一个固定号码，人人都想知道这个号码对自己意味着什么。
国王便做了很多个盒子，每个盒子拥有一个编号。人们需要通过一定的方法才能确定哪个盒子有自己的秘密。
这个办法就是把自己的固定号码的各个位上的数字求和。例如12，1+2=3，即号码12的这个人秘密就在编号为3的盒子中。
           Input                                                        Output
输入一个数字N(1 <= N <= 500000)                               输出一个代表输入数据对应的秘密盒子编号
            12                                                            3*/

import java.util.Scanner;

public class testDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 500000) {
            int ge = num % 10;
            int shi = num / 10 % 10;
            int bai = num / 100 % 10;
            int qian = num / 1000 % 10;
            int wan = num / 10000 % 10;
            int shiwan = num / 100000 % 10;
            System.out.println(ge + shi + bai + qian + wan + shiwan);
        } else {
            System.out.println("请重新输入:");
        }
    }
}
