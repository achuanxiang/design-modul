package com.design.bridging;

/**
 * @Auther: chuan
 * @Date: 2019/9/9 09:58
 * @Description:
 */
public class BridgingApplication {

    public static void main(String[] args) {
           Shape redShape = new Circle(new RedDraw(),3,5,6);
           Shape blueShape = new Circle(new BlueDraw(),4,5,8);
           redShape.play();
           blueShape.play();
    }

}