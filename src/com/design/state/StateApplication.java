package com.design.state;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 17:29
 * @Description:
 */
public class StateApplication {

    public static void main(String[] args) {
             Food food = new Food();
             food.setHour(7);
             food.doSomething();
             food.setHour(12);
             food.doSomething();
             food.setHour(18);
             food.doSomething();
             food.setHour(8);
             food.doSomething();
             food.setHour(13);
             food.doSomething();
             food.setHour(7);
             food.doSomething();

    }

}