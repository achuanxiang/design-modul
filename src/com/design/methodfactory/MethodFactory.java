package com.design.methodfactory;

import com.design.methodfactory.impls.BlueCarFactory;
import com.design.methodfactory.impls.GreenCarFactory;
import com.design.methodfactory.impls.RedCarFactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 16:14
 * @Description: 工厂方法模式启动类
 */
public class MethodFactory {

    public static void main(String[] args) {
        CarFactory redCarFactory = new RedCarFactory();
        CarFactory greenCarFactory = new GreenCarFactory();
        CarFactory blueCarFactory = new BlueCarFactory();
        Car redCar = redCarFactory.getCar();
        Car greenCar = greenCarFactory.getCar();
        Car blueCar = blueCarFactory.getCar();
        redCar.display();
        greenCar.display();
        blueCar.display();
    }

}