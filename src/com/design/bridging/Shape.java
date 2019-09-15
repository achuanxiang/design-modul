package com.design.bridging;

/**
 * @Auther: chuan
 * @Date: 2019/9/11 09:59
 * @Description: DrawAPI 接口创建抽象类 Shape
 */
public abstract class Shape {

    protected  DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    abstract  void  play();

}