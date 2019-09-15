package com.design.facade;

/**
 * @Auther: chuan
 * @Date: 2019/9/6 17:18
 * @Description:
 */
public class FacadeApplication {

    public static void main(String[] args) {
              StockFacade stockFacade = new StockFacade();
              stockFacade.doABC();
              System.out.println("========================");
              stockFacade.doAC();
    }

}