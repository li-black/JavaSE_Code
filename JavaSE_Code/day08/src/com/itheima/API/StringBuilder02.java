package com.itheima.API;

//创建StringBulider类并调用方法
public class StringBuilder02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("add").append("add").append("123");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.reverse();
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
    }
}
