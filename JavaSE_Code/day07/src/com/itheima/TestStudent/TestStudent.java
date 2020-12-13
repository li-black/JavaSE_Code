package com.itheima.TestStudent;

//测试Student类,用方法赋值
public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(60);
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        stu.study();
    }
}
