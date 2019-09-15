package com.design.methodfactory.impls;

import com.design.methodfactory.Car;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 16:18
 * @Description:
 */
public class BlueCar implements Car {

    @Override
    public void display() {
        System.out.println("生产了一个蓝色的汽车");
    }

}