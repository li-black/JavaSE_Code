package com.itheima.Test;

//未完成

import java.util.Scanner;

/*单词的压缩编码
Description
给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。
例如，如果这个列表是 ["time", "me", "bell"]，我们就可以将其表示为 S = "time#bell#" 和 indexes = [0, 2, 5]。
对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 "#" 结束，来恢复我们之前的单词列表。
那么成功对给定单词列表进行编码的最小字符串长度是多少呢？
Input
输入仅一行，包含多个单词，之间用逗号分隔
Output
输出一个整数，表示对给定单词列表进行编码的最小字符串长度
Sample Input 1                                      Sample Output 1
time,me,bell                                            10*/
public class TestDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder("1");
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            int index = sb.indexOf(split[i]);
            if (index == -1 && i == 0) {
                sb.append(split[i]);
            }
        }
    }
}
