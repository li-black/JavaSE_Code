package com.itheima.HomeWork;

public class Teacher {
    private String name;
    private int TeacherYear;

    public Teacher() {
    }

    public Teacher(String name, int teacherYear) {
        this.name = name;
        TeacherYear = teacherYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTeacherYear(int teacherYear) {
        TeacherYear = teacherYear;
    }

    public int getTeacherYear() {
        return TeacherYear;
    }

    public void show() {
        System.out.println(name + "..." + TeacherYear);
    }
}
