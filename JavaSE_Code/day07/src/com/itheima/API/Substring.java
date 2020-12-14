package com.itheima.API;

import java.util.Scanner;

//用Sunstring截取字符串
public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号:");
        String phone = sc.nextLine();
        String phoneben = phone.substring(0, 3);
        String phoneend = phone.substring(7);
        String phone1 = phoneben + "****" + phoneend;
        System.out.println(phone1);
    }
}
