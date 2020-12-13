package com.itheima.TestStudent02;

//测试Student类
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.show();
        Student s2 = new Student("张三", 23);
        s2.show();
    }
}
