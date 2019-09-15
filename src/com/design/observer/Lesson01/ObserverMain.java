package com.design.observer.Lesson01;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 15:36
 * @Description:
 */
public class ObserverMain {

    public static void main(String[] args) {
        MyObserver myObserver1 = new MyObserver();
        MyObserver myObserver2 = new MyObserver();
        MeteorologicalSubject meteorologicalSubject = new MeteorologicalSubject();
        meteorologicalSubject.addObserver(myObserver1);
        meteorologicalSubject.addObserver(myObserver2);
        System.out.println("观察者数量 = "+meteorologicalSubject.countObservers());
        meteorologicalSubject.setHumidity(34);
    }

}