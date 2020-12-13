package com.itheima.Testcat;

//Cat类
public class Cat {
    private String name;
    private int age;

    public Cat() {
        System.out.println("空参构造");
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setage(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("输入有误");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getage() {
        return this.age;
    }

    public void show() {
        System.out.println(this.name + "..." + this.age);
    }
}
