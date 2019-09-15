package com.design.cor;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 10:54
 * @Description:
 */
public class CORApplication {

    public static void main(String[] args) {
           CarHandler carHeadHandler = new CarHeaderHandler();
           CarHandler carBodyHandler = new CarBodyHandler();
           CarHandler carTailHandler = new CarTailHandler();
           CarHandler carColorHandler = new CarColorHandler();
           carHeadHandler.setNextCarHandler(carBodyHandler);
           carBodyHandler.setNextCarHandler(carTailHandler);
           carTailHandler.setNextCarHandler(carColorHandler);

           carHeadHandler.handler();
    }

}