package com.design.testfactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 21:42
 * @Description: 产品角色：减法
 */
public class SubOperation extends Operation{

    @Override
    public double run() {
        return this.getFirst() - this.getSecond();
    }
}