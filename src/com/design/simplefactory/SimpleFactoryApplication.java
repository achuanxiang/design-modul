package com.design.simplefactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 15:08
 * @Description:简单工厂模式启动类
 */
public class SimpleFactoryApplication {

    public static void main(String[] args) {
           Fruit apple1 = FruitFactory.getApple();
           Fruit banana1 = FruitFactory.getBanana();
           apple1.get();
           banana1.get();
           System.out.println("================================");
           Fruit apple2 = FruitFactory.getFruitIgnoreCase("apple");
           Fruit banana2 = FruitFactory.getFruitIgnoreCase("baNana");
           apple2.get();
           banana2.get();
           System.out.println("================================");

    }

}