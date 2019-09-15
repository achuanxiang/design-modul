package com.design.template;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 15:41
 * @Description:  抽象角色：造车类
 */
public abstract class Car {

    //模板类
    public void make(){
         makeHead();
         makeBody();
         makeTail();
    }

    public abstract void makeHead();

    public abstract void makeBody();

    public abstract void makeTail();

}