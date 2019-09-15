package com.design.strategy.interfaces.fly.impl;

import com.design.strategy.interfaces.fly.FlyBehavior;

/**
 * @Auther: chuan
 * @Date: 2019/8/23 15:12
 * @Description:
 */
public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can Fly Very Good");
    }
}