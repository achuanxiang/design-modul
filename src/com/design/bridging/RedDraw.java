package com.design.bridging;

/**
 * @Auther: chuan
 * @Date: 2019/9/11 09:54
 * @Description: 实体桥接实现类;红色画板
 */
public class RedDraw implements DrawApi {

    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("画一个红色的图案，长 = " + x + "宽 = " + y + "半径 = " + radius);
    }
}