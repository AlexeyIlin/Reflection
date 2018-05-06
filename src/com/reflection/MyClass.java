package com.reflection;

import javax.annotation.Resource;

/**
 * Created by Aleksey on 01.05.2018.
 */
public class MyClass implements MyInterface {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyClass(String name ,int age) {
        this.age = age;
        this.name = name;
    }


     public <Str> Str doSomeThing(Str a){
        return a;
    }


}
