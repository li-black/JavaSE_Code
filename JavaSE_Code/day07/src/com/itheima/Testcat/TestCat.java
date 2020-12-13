package com.itheima.Testcat;

// 测试Cat类
public class TestCat {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.setName("tom");
        tom.setage(23);
        tom.show();
        Cat cat = new Cat("tom1");
        cat.setage(22);
        cat.show();
        Cat cat1 = new Cat("tom2", 23);
        cat1.show();
    }
}
