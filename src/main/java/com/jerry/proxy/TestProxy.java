package com.jerry.proxy;

public class TestProxy {
    public static void main(String[] args) {
        Person zhangsan=new Student("zhangsan");
        Person studyMembers=new StudentProxy(zhangsan);
        studyMembers.submitHomework();
    }
}
