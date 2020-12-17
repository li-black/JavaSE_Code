package com.itheima.other;
//定义方法筛选出Arraylist中年龄小于18岁的对象

import java.util.ArrayList;

public class TestStudent7 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 7);
        Student stu3 = new Student("王五", 17);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        ArrayList<Student> getlist = getlist(list);
        for (int i = 0; i < getlist.size(); i++) {
            Student stu = getlist.get(i);
            System.out.println(stu.getName());
        }
    }

    public static ArrayList getlist(ArrayList<Student> list) {
        ArrayList<Student> newlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i);
            if (list.get(i).getAge() < 18) {
                newlist.add(list.get(i));
            }
        }
        return newlist;
    }
}
