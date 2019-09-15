package com.design.state;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 17:36
 * @Description: 具体状态类：时间未定义
 */
public class NoState extends  State {

    @Override
    public void doSomething(Food food) {
          System.out.println(food.getHour() + "这个时间状态未定义");
    }

}