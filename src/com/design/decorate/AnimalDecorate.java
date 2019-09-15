package com.design.decorate;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 14:32
 * @Description: 抽象装饰者：动物装饰抽象类;需要实现并调用Animal抽象产品接口
 */
public abstract class AnimalDecorate implements Animal{

   private Animal animal;

    public AnimalDecorate(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void show() {
        animal.show();
    }

}