package com.lkl.framework.jmx;

public class Hello implements HelloMBean {

    private String name = "zhangsan";

    private String age = "18";

    @Override
    public void sayHello() {
        System.out.println("hello world ,name = " + name + ",age = " + age);
    }

    @Override
    public void sayHello(String content) {
        System.out.println("hello :" + content);
    }

    @Override
    public void getPersonInfo() {
        System.out.println(this);
    }

    @Override
    public String getName() {
        System.out.println("name getter");
        return name;
    }

    @Override
    public void setName(String name) {
        System.out.println("name setter");
        this.name = name;
    }

    @Override
    public String getAge() {
        System.out.println("age getter");
        return age;
    }

    @Override
    public void setAge(String age) {
        System.out.println("name setter");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}