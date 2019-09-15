package com.design.template;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 15:40
 * @Description:
 */
public class TemplateApplication {

    public static void main(String[] args) {
          Car bus = new BusCar();
          Car jeep = new JeepCar();
          bus.make();
          jeep.make();
    }

}