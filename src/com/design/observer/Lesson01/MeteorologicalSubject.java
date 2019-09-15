package com.design.observer.Lesson01;

import java.util.Observable;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 15:37
 * @Description: 被观察者：气象站
 */
public class MeteorologicalSubject extends Observable {

    private double temperature;

    private double humidity;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        this.setChanged();
        this.notifyObservers();
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        this.setChanged();
        this.notifyObservers();
    }
}