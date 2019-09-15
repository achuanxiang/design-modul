package com.design.methodfactory.impls;

import com.design.methodfactory.Car;
import com.design.methodfactory.CarFactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 16:20
 * @Description:
 */
public class BlueCarFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new BlueCar();
    }
}