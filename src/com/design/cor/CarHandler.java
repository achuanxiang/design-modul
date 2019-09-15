package com.design.cor;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 11:20
 * @Description: 任务抽象类：组装汽车业务
 */
public abstract class CarHandler {

    protected  CarHandler nextCarHandler;

    public void setNextCarHandler(CarHandler nextCarHandler) {
        this.nextCarHandler = nextCarHandler;
    }

    public abstract void handler();

}