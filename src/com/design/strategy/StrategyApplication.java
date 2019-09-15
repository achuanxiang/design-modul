package com.design.strategy;

import com.design.strategy.interfaces.fly.impl.NoFlyBehavior;
import com.design.strategy.interfaces.yell.impl.GegeYellBehavior;

/**
 * @Auther: chuan
 * @Date: 2019/8/23 13:41
 * @Description:   策略设计模式启动类
 */
public class StrategyApplication {

    public static void main(String[] args) {
        Duck greenDuck = new GreenDuck();
        Duck yellowDuck = new YellowDuck();

        greenDuck.swim();
        greenDuck.fly();
        greenDuck.yell();
        greenDuck.display();
        System.out.println("====================================");
        yellowDuck.swim();
        yellowDuck.fly();
        yellowDuck.yell();
        yellowDuck.display();
        System.out.println("====================================");
        //测试超类中的set方法是否生效
        yellowDuck.swim();
        yellowDuck.setFlyBehavior(new NoFlyBehavior());
        yellowDuck.fly();
        yellowDuck.setYellBehavior(new GegeYellBehavior());
        yellowDuck.yell();
        yellowDuck.display();
    }

}