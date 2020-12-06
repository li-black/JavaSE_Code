package com.Test;
/*水仙花数
Description
春天是鲜花的季节，水仙花就是其中最迷人的代表，数学上有个水仙花数，
他是这样定义的：“水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，
比如：153=1^3+5^3+3^3。
Input
输入包含两个整数m和n（100<=m<=n<=999）
Output
输出所有在给定范围内的水仙花数，就是说，输出的水仙花数必须大于等于m,并且小于等于n，
如果有多个，则要求从小到大排列在一行内输出，之间用一个空格隔开，
如果给定的范围内不存在水仙花数，则输出no;
Sample Input 1                      Sample Output 1
     100 371                           153 370 371
 Sample Input 2                     Sample Output 2
     100 101                             no*/

import java.util.Scanner;

public class testDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("no");
        }
    }
}
