package com.design.facade;

/**
 * @Auther: chuan
 * @Date: 2019/9/6 17:21
 * @Description: 委托调用角色：股票基金
 */
public class StockFacade {

    private StockA stockA;

    private StockB stockB;

    private StockC stockC;

    public StockFacade() {
        stockA = new StockA();
        stockB = new StockB();
        stockC = new StockC();
    }

    public void doABC(){
        stockA.display();
        stockB.display();
        stockC.display();
    }

    public void doAC(){
        stockA.display();
        stockC.display();
    }

}