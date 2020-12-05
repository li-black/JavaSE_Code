package Test;
/*计算Sn
Description
求Sn=a+aa+aaa+…+aa…aaa（有n个a）之值，其中a是一个数字。例如：2+22+222+2222+22222（n=5）
Input
输入两个数．第一个为a，第二个为n（表示有多少个数相加），其中a和n都是整数
Output
输出Sn的值
Sample Input 1                              Sample Input 1
       2
       5                                        24690*/
import java.util.Scanner;

public class testDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int b = a;
        for(int i = 1; i <= n; i ++){
            sum += b;
            b = a + b * 10;
        }
        System.out.println(sum);
    }
}