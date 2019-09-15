package com.design.observer.lesson02;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 16:09
 * @Description:  抽象观察者角色
 */
public abstract class Observer {

    public  MeteorologicalSubject meteorologicalSubject;

    abstract void update();

}