package com.design.strategy.interfaces.fly.impl;

import com.design.strategy.interfaces.fly.FlyBehavior;

/**
 * @Auther: chuan
 * @Date: 2019/8/23 15:16
 * @Description:
 */
public class NoFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't Fly any more");
    }
}