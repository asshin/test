package com.wang.spring;

public class Student {
    private  String  name;
    private  Major   major;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Major getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", major=" + major.getMajorName() +
                '}';
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public static void main(String[] args) {
        System.out.println("1111111111");
    }
}
