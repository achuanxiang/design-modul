package com.design.cor;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 11:28
 * @Description: 具体任务链角色：组装车尾
 */
public class CarTailHandler extends CarHandler {

    @Override
    public void handler() {
        System.out.println("组装车尾");
        if (this.nextCarHandler != null){
            nextCarHandler.handler();
        }
    }
}