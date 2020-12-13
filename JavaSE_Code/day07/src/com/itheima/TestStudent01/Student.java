package com.itheima.TestStudent01;

//private权限修饰Student类,用this来区分成员变量和局部变量,retur默认返回this.成员变量
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("构造方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("输入有误");
            this.age = -1;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void study() {
        System.out.println(name + " " + age);
    }
}
