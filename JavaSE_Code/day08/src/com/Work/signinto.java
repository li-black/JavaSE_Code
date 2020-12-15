package com.Work;
//用户登录案例

import java.util.Scanner;

public class signinto {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
        for (int i = 1; i <= 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String scannerusername = sc.nextLine();
            System.out.println("请输入密码");
            String scannerpassword = sc.nextLine();
            if (username.equals(scannerusername) && password.equals(scannerpassword)) {
                System.out.println("登录成功");
                break;
            } else if (i == 3) {
                System.out.println("账户锁定");
            } else {
                System.out.println("输入错误,您还有" + (3 - i) + "次机会");
            }
        }
    }
}
