package com.itheima.other;
//Arraylist键盘录入添加对象并打印

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = getStudent();
        Student stu2 = getStudent();
        Student stu3 = getStudent();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "..." + stu.getAge());
        }
    }

    public static Student getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入姓名：");
        String name = sc.next();
        System.out.println("输入年龄：");
        int age = sc.nextInt();
        Student stu = new Student(name, age);
        return stu;
    }
}
