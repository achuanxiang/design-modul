package com.design.simplefactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 15:12
 * @Description:香蕉类
 */
public class Banana implements  Fruit{

    @Override
    public void get() {
        System.out.println("我是香蕉，黄色的");
    }
}