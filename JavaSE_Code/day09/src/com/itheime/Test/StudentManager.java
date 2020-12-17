package com.itheime.Test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择");
            String choice = sc.next();
            switch (choice) {
                case "1":
//                    System.out.println("添加学生");
                    addstudent(list);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleststudent(list);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updatestudent(list);
                    break;
                case "4":
//                    System.out.println("查看学生");
                    querystudents(list);
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    System.exit(0);
                    break;
                default: {
                    System.out.println("输入有误,请重新输入");
                }
            }
        }
    }

    public static void addstudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学号");
            sid = sc.next();
            int getindex = getindex(list, sid);
            if (getindex != -1) {
                System.out.println("你输入的学号已被占用，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入生日");
        String birthday = sc.next();
        Student stu = new Student(sid, name, age, birthday);
        list.add(stu);
        System.out.println("添加成功");
    }

    private static void deleststudent(ArrayList<Student> list) {
        System.out.println("请输入要删除的学生学号");
        Scanner sc = new Scanner(System.in);
        String deletesid = sc.next();
        int getindex = getindex(list, deletesid);
        if (getindex == -1) {
            System.out.println("查无信息，请重新输入");
        } else {
            list.remove(getindex);
            System.out.println("删除成功");
        }
    }

    private static void updatestudent(ArrayList<Student> list) {
        System.out.println("请输入要修改的学生学号");
        Scanner sc = new Scanner(System.in);
        String updatesid = sc.next();
        int getindex = getindex(list, updatesid);
        if (getindex == -1) {
            System.out.println("查无信息，请重新输入");
        } else {
            System.out.println("请输入新的学生姓名");
            String name = sc.next();
            System.out.println("请输入新的学生年龄");
            int age = sc.nextInt();
            System.out.println("请输入新的学生生日");
            String birthday = sc.next();
            Student stu = new Student(updatesid, name, age, birthday);
            list.set(getindex, stu);
            System.out.println("修改成功");
        }
    }

    public static void querystudents(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("无信息，请输入后再来查询");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getSid() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
        }
    }

    public static int getindex(ArrayList<Student> list, String sid) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String id = stu.getSid();
            if (sid.equals(id)) {
                index = i;
            }
        }
        return index;
    }
}
