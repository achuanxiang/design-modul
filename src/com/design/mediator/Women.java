package com.design.mediator;

/**
 * @Auther: chuan
 * @Date: 2019/9/11 22:33
 * @Description: 具体同事角色：女人
 */
public class Women extends  People{
    public Women(String name, int condition, Mediator mediator) {
        super(name, condition, mediator);
    }

    @Override
    public void match(People people) {
        this.getMediator().setWomen(this);
        this.getMediator().match(people);
    }

}