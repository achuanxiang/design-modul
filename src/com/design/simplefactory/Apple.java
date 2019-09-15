package com.design.simplefactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 15:11
 * @Description:苹果类
 */
public class Apple implements  Fruit{

    @Override
    public void get() {
        System.out.println("我是苹果，红色的");
    }
}