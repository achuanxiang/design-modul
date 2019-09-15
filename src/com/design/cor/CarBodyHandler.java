package com.design.cor;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 11:27
 * @Description: 具体任务链角色：组装车身
 */
public class CarBodyHandler extends CarHandler {

    @Override
    public void handler() {
        System.out.println("组装车身");
        if (this.nextCarHandler != null){
            nextCarHandler.handler();
        }
    }
}