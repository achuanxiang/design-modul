package com.design.observer.lesson02;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 15:57
 * @Description:
 */
public class ObserverApplication {

    public static void main(String[] args) {
          MeteorologicalSubject meteorologicalSubject = new MeteorologicalSubject();
          Observer temperatureObserver = new TemperatureObserver(meteorologicalSubject);
          Observer humidityObserver = new HumidityObserver(meteorologicalSubject);
          meteorologicalSubject.addObserver(temperatureObserver);
          meteorologicalSubject.addObserver(humidityObserver);
          meteorologicalSubject.setTemperature(23);
          meteorologicalSubject.setHumidity(56);

    }

}