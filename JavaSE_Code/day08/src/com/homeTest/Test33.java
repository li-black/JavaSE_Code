package com.homeTest;

public class Test33 {
    public static void main(String[] args) {
        User u1 = new User("夏诗韵", 20, "读书");
        User u2 = new User("慕容雪痕", 21, "弹钢琴");
        User u3 = new User("燕清舞", 18, "跳舞");
        User[] arr = new User[3];
        arr[0] = u1;
        arr[1] = u2;
        arr[2] = u3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].age >= 20) {
                arr[i].setLike("敲代码");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].show(arr[i]);
        }
    }
}
