package com.design.state;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 17:31
 * @Description: 产品类：food吃饭
 */
public class Food {

    private int hour;

    private State state;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Food() {
        state = new BreakfastState();
    }

    public void doSomething(){
        state.doSomething(this);
        state = new BreakfastState();
    }
}