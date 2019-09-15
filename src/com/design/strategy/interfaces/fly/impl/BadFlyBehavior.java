package com.design.strategy.interfaces.fly.impl;

import com.design.strategy.interfaces.fly.FlyBehavior;

/**
 * @Auther: chuan
 * @Date: 2019/8/23 15:15
 * @Description:
 */
public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I fly so bad");
    }
}