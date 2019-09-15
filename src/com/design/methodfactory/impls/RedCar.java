package com.design.methodfactory.impls;

import com.design.methodfactory.Car;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 16:16
 * @Description:
 */
public class RedCar  implements Car {

    @Override
    public void display() {
        System.out.println("生产了一辆红色的汽车");
    }
}