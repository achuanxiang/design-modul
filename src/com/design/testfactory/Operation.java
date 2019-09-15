package com.design.testfactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 21:36
 * @Description: 抽象角色：运算类
 */
public class Operation {

    private double first;

    private double second;

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double run(){
        return  0.0;
    };

}