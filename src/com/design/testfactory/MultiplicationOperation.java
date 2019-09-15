package com.design.testfactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 21:44
 * @Description: 产品角色：乘法
 */
public class MultiplicationOperation extends Operation{

    @Override
    public double run() {
        return this.getFirst() * this.getSecond();
    }
}