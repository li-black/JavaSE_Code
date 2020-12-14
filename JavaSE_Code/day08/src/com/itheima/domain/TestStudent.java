package com.itheima.domain;
//用split方法将字符串按特定符号切割

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息");
        String stuIn = sc.nextLine();
        String[] split = stuIn.split(",");
        Student stu = new Student();
        stu.setName(split[0]);
        stu.setAge(split[1]);
        stu.show();
    }
}
