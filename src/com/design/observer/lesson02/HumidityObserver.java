package com.design.observer.lesson02;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 16:19
 * @Description: 具体观察者:湿度观察者
 */
public class HumidityObserver extends  Observer{

    public HumidityObserver(MeteorologicalSubject meteorologicalSubject) {
         this.meteorologicalSubject = meteorologicalSubject;
    }

    @Override
    void update() {
        System.out.println("湿度发生了改变 = " + meteorologicalSubject.getHumidity());
    }
}