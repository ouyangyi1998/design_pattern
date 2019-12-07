package com.jerry.proxy;

public class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void submitHomework() {
        System.out.println(name+"提交了作业");
    }
}
