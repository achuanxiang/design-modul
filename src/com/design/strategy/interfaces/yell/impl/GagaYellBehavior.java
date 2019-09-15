package com.design.strategy.interfaces.yell.impl;

import com.design.strategy.interfaces.yell.YellBehavior;

/**
 * @Auther: chuan
 * @Date: 2019/8/23 15:18
 * @Description:
 */
public class GagaYellBehavior implements YellBehavior {

    @Override
    public void yell() {
        System.out.println("I only can gaga yell");
    }
}