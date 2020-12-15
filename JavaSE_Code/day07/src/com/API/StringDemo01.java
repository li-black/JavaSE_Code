package com.API;

//String的4种定义
public class StringDemo01 {
    public static void main(String[] args) {
        String a = new String();
        char[] chs = {'a', 'b', 'c'};
        String b = new String(chs);
        String c = new String("abc");
        String d = "abc";
    }
}
