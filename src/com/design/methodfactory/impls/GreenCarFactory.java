package com.design.methodfactory.impls;

import com.design.methodfactory.Car;
import com.design.methodfactory.CarFactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 16:21
 * @Description:
 */
public class GreenCarFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new GreenCar();
    }
}