package com.itheima.API;
//已知用户名和密码,用程序实现登录,总共三次机会,能够给出相应的提示

import java.util.Scanner;

public class Signinto01 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名和密码，您有3次机会");
        for (int i = 2; i >= 0; i--) {
            String scannerusername = sc.next();
            String scannerpassword = sc.next();
            if (username.equals(scannerusername) && password.equals(scannerpassword)) {
                System.out.println("登录成功");
                break;
            } else if (i == 0) {
                System.out.println("账户锁定");
            } else {
                System.out.println("用户名或密码输入错误,请重新输入!剩余次数" + i + "次");
            }
        }
    }
}
