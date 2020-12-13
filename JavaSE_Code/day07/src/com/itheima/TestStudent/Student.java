package com.itheima.TestStudent;

//private权限修饰Student类
public class Student {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        if (a >= 0 && a <= 120) {
            age = a;
        } else {
            System.out.println("输入有误");
            age = -1;
        }
    }

    public int getAge() {
        return age;
    }

    public void study() {
        System.out.println(name + " " + age);
    }
}
