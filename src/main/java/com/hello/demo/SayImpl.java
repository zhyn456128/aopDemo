package com.hello.demo;

public class SayImpl implements Say{
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("hello,"+name);
        System.out.println("test,"+name);
    }
}
