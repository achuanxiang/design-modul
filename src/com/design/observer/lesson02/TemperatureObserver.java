package com.design.observer.lesson02;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 16:16
 * @Description: 具体观察者：温度观察者
 */
public class TemperatureObserver extends  Observer {

    public TemperatureObserver(MeteorologicalSubject meteorologicalSubject) {
        this.meteorologicalSubject = meteorologicalSubject;
    }

    @Override
    void update() {
        System.out.println("温度发生了改变 = " + meteorologicalSubject.getTemperature());
    }
}