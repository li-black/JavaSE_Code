package com.API;
//字符串比较实现用户登录案例

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("输入用户名");
            String ue = sc.nextLine();
            System.out.println("输入密码");
            String pd = sc.nextLine();
            if (ue.equals(username) && pd.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 3) {
                    System.out.println("账户锁定");
                } else {
                    System.out.println("输入失败,您还有" + (3 - i) + "次机会");
                }
            }
        }
    }
}
