package com.design.decorate;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 14:40
 * @Description: 具体装饰者：装饰游泳的行为；需要继承抽象装饰者
 */
public class SwimDecorate extends AnimalDecorate {

    public SwimDecorate(Animal animal) {
        super(animal);
    }

    @Override
    public void show() {
        super.show();
        swim();
    }

    public void swim(){
        System.out.println("能在水里游");
    }
}