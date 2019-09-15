package com.design.strategy;

import com.design.strategy.interfaces.fly.impl.BadFlyBehavior;
import com.design.strategy.interfaces.yell.impl.GegeYellBehavior;

/**
 * @Auther: chuan
 * @Date: 2019/8/23 15:20
 * @Description:
 */
public class GreenDuck extends Duck {

    public GreenDuck() {
        flyBehavior = new BadFlyBehavior();
        yellBehavior = new GegeYellBehavior();
    }

    @Override
    void display() {
        System.out.println("我是绿毛鸭");
    }
}