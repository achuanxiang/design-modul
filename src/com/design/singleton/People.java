package com.design.singleton;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 09:11
 * @Description:  饿汉式单例模式
 */
public class People {

    private static  final  People PEOPLE = new People();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private People() {
    }

    public static People getPeople(){
        return PEOPLE;
    }

}