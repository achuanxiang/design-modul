package com.design.mediator;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 * @Auther: chuan
 * @Date: 2019/9/11 22:29
 * @Description:  抽象同事角色：人
 */
public abstract class People {

    private String name;

    private int condition;

    private Mediator mediator;

    public People(String name, int condition, Mediator mediator) {
        this.name = name;
        this.condition = condition;
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public abstract  void match(People people);
}