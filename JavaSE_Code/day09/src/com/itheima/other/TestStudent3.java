package com.itheima.other;
//定义方法筛选出Arraylist中年龄小于18岁的对象

import java.util.ArrayList;

public class TestStudent3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 18);
        Student stu3 = new Student("王五", 17);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        ArrayList<Student> list1 = getList(list);
        for (int i = 0; i < list1.size(); i++) {
            Student stu = list1.get(i);
            System.out.println(stu.getName() + "..." + stu.getAge());
        }
    }

    public static ArrayList<Student> getList(ArrayList<Student> list) {
        ArrayList<Student> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getAge() < 18) {
                newList.add(stu);
            }
        }
        return newList;
    }
}
