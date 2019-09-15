package com.design.decorate;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 14:38
 * @Description: 具体装饰者：装饰奔跑功能；需要继承抽象装饰者
 */
public class RunDecorate extends AnimalDecorate {

    public RunDecorate(Animal animal) {
        super(animal);
    }

    @Override
    public void show() {
        super.show();
        run();
    }

    public void run(){
        System.out.println("能在地上跑");
    }
}