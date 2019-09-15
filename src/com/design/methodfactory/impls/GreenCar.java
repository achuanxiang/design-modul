package com.design.methodfactory.impls;

import com.design.methodfactory.Car;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 16:17
 * @Description:
 */
public class GreenCar implements Car {

    @Override
    public void display() {
        System.out.println("生产了一辆绿色汽车");
    }
}