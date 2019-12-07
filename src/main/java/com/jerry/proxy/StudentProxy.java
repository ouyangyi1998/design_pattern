package com.jerry.proxy;
/*被代理的学生*/
public class StudentProxy implements Person{
    @Override
    public void submitHomework() {
        zhangsan.submitHomework();
    }
    Student zhangsan;
    public StudentProxy(Person student)
    {
        if(student instanceof Student)
        {
            this.zhangsan=(Student)student;
        }
    }
}
