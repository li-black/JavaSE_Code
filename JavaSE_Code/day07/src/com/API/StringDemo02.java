package com.API;

//字符串的比较方法equals区分大小写,equalsIgnoreCase不区分大小写
public class StringDemo02 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "abc";
        boolean n = s1.equals(s2);
        System.out.println(n);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
