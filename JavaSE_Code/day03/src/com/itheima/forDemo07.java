package com.itheima;

import java.util.Scanner;

public class forDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            if(a >= 0 && a <= 100){
                System.out.println("输入正确！");
                break;
            }else{
                System.out.println("请重新输入:");
            }
        }
    }
}
