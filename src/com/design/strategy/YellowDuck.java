package com.design.strategy;

import com.design.strategy.interfaces.fly.impl.GoodFlyBehavior;
import com.design.strategy.interfaces.yell.impl.GagaYellBehavior;

/**
 * @Auther: chuan
 * @Date: 2019/8/23 15:22
 * @Description:
 */
public class YellowDuck extends Duck {

    public YellowDuck() {
        flyBehavior = new GoodFlyBehavior();
        yellBehavior = new GagaYellBehavior();
    }

    @Override
    void display() {
        System.out.println("我是黄毛鸭");
    }

}