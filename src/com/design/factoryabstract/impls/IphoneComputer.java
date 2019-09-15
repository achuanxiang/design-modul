package com.design.factoryabstract.impls;

import com.design.factoryabstract.Computer;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 17:41
 * @Description:产品角色：苹果牌笔记本电脑
 */
public class IphoneComputer implements Computer {

    @Override
    public void display() {
        System.out.println("我是一个苹果牌笔记本电脑");
    }
}