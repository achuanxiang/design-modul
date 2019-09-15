package com.design.decorate;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 14:30
 * @Description: 具体产品：抽象产品接口的实现类，在这里指初始化animal
 */
public class AnimalImpl implements  Animal{

    @Override
    public void show() {
        System.out.println("我是一个空白的动物");
    }
}