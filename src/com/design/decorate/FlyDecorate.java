package com.design.decorate;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 14:35
 * @Description: 具体装饰者角色：装饰飞翔功能；需要继承抽象装饰者
 */
public class FlyDecorate extends AnimalDecorate{

    public FlyDecorate(Animal animal) {
        super(animal);
    }

    @Override
    public void show() {
        super.show();
        fly();
    }

    public void fly(){
        System.out.println("可以在天上飞");
    }
}