package com.itheima.other;
//Arraylist删除对象

import java.util.ArrayList;

public class TestStudent6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("test");
        list.add("test");
        for (int i = 0; i < list.size(); i++) {
            if ("test".equals(list.get(i))) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
