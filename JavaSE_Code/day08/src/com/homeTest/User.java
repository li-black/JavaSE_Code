package com.homeTest;

public class User {
    String name;
    int age;
    String like;

    public User() {
    }

    public User(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public void show(User use) {
        System.out.println(use.name + use.age + use.like);
    }
}
