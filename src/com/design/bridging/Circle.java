package com.design.bridging;

/**
 * @Auther: chuan
 * @Date: 2019/9/11 10:02
 * @Description: 使用 Shape 和 DrawAPI 类画出不同颜色的图形
 */
public class Circle extends  Shape{

    private int x;
    private int y;
    private int radius;

    public Circle(DrawApi drawApi, int x, int y, int radius) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void play() {
        drawApi.draw(x,y,radius);
    }
}