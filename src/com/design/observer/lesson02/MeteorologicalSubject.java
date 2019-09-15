package com.design.observer.lesson02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 15:56
 * @Description: 被观察者：气象站
 */
public class MeteorologicalSubject {

    private double temperature;

    private double humidity;

    private List<Observer> observers = new ArrayList<>();

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }

    public double getHumidity() {
        return humidity;
    }

    /*/**
     * @Description  ：添加新的观察者
     * @author       : chuan
     * @param        : [observer]
     * @return       : void
     * @exception    :
     */
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    /*/**
     * @Description  ：获取所有观察者的数量
     * @author       : chuan
     * @param        : []
     * @return       : int
     * @exception    :
     */
    public int getObserversSize(){
        return observers.size();
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        this.notifyObservers();
    }

    /*/**
     * @Description  ：消息推送：当属性改变时调用
     * @author       : chuan
     * @param        : []
     * @return       : void
     * @exception    :
     */
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}