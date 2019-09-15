package com.design.cor;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 11:29
 * @Description: 具体任务链角色：组装车漆颜色
 */
public class CarColorHandler extends CarHandler {

    @Override
    public void handler() {
        System.out.println("组装车漆颜色");
        if (this.nextCarHandler != null){
            nextCarHandler.handler();
        }
    }

}