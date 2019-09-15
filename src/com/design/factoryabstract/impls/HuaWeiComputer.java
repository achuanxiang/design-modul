package com.design.factoryabstract.impls;

import com.design.factoryabstract.Computer;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 17:35
 * @Description:产品角色;华为笔记本电脑
 */
public class HuaWeiComputer implements Computer {

    @Override
    public void display() {
        System.out.println("我是一个华为笔记本电脑");
    }
}