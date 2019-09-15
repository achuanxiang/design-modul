package com.design.template;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 15:47
 * @Description: 具体角色：吉普
 */
public class JeepCar extends Car {

    @Override
    public void makeHead() {
        System.out.println("吉普：安装车头");
    }

    @Override
    public void makeBody() {
        System.out.println("吉普：安装车身");
    }

    @Override
    public void makeTail() {
        System.out.println("吉普：安装车尾");
    }

}