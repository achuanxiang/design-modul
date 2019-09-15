package com.design.strategy;

import com.design.strategy.interfaces.fly.FlyBehavior;
import com.design.strategy.interfaces.yell.YellBehavior;

/**
 * @Auther: chuan
 * @Date: 2019/8/23 15:01
 * @Description:
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    YellBehavior yellBehavior;

    public Duck() {
    }

    /*/**
     * @Description  ：鸭子的不可变属性，所有的鸭子都会游泳
     * @author       : chuan
     * @param        :
     * @return       : void
     * @exception    :
     */
    public void swim(){
        System.out.println("I can swimming");
    }

    public void fly(){
        flyBehavior.fly();
    }

    public void yell(){
        yellBehavior.yell();
    }

    void display(){};
    
    /*/**
     * @Description  ：加入飞行行为的set方法，使得我们可以外部的改变flyBehavior的对象值
     * @author       : chuan
     * @param        : [flyBehavior]
     * @return       : void
     * @exception    :
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /*/**
     * @Description  ：加入叫声行为的set方法，使得我们可以外部的改变yellBehavior的对象值
     * @author       : chuan
     * @param        : [yellBehavior]
     * @return       : void
     * @exception    :
     */
    public void setYellBehavior(YellBehavior yellBehavior) {
        this.yellBehavior = yellBehavior;
    }
}