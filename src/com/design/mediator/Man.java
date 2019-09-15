package com.design.mediator;

/**
 * @Auther: chuan
 * @Date: 2019/9/11 22:31
 * @Description: 具体同事角色：男人
 */
public class Man extends People {
    public Man(String name, int condition, Mediator mediator) {
        super(name, condition, mediator);
    }

    @Override
    public void match(People people) {
        this.getMediator().setMan(this);
        this.getMediator().match(people);
    }
}