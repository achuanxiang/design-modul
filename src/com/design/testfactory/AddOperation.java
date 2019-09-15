package com.design.testfactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 21:38
 * @Description: 产品角色：相加类
 */
public class AddOperation extends Operation{

    @Override
    public double run() {
        return this.getFirst() + this.getSecond();
    }
}