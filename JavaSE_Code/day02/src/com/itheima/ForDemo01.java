package com.itheima;

//输出几时几分
public class ForDemo01 {
    public static void main(String[] args) {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.println("现在" + i + "时" + j + "分");
            }
        }
    }
}