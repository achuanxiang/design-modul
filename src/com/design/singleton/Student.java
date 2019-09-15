package com.design.singleton;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 09:13
 * @Description: 懒汉式单例模式
 */
public class Student {

    private static Student student;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Student(){

    }

    public static Student getStudent(){
        if (student == null){
            student = new Student();
        }
        return student;
    }
}