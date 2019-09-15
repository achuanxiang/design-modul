package com.design.template;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 15:44
 * @Description: 具体角色：公交
 */
public class BusCar extends Car{

    @Override
    public void makeHead() {
        System.out.println("公交：安装车头");
    }

    @Override
    public void makeBody() {
        System.out.println("公交：安装车身");
    }

    @Override
    public void makeTail() {
        System.out.println("公交：安装车尾");
    }
}