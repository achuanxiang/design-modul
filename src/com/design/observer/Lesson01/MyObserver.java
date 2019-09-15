package com.design.observer.Lesson01;

import java.util.Observable;
import java.util.Observer;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 15:39
 * @Description: 观察者
 */
public class MyObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("气象站温度湿度已经发生改变");
    }
}