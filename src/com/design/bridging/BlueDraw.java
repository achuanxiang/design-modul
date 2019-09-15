package com.design.bridging;

/**
 * @Auther: chuan
 * @Date: 2019/9/11 09:56
 * @Description: 实体桥接实现类;蓝色画板
 */
public class BlueDraw implements DrawApi {

    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("画一个蓝色的图案，长 = " + x + "宽 = " + y + "半径 = " + radius);
    }
}