package com.design.testfactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 21:46
 * @Description: 产品角色：除法
 */
public class DivisionOperation extends Operation {

    @Override
    public double run() {
        return this.getFirst() / this.getSecond();
    }
}