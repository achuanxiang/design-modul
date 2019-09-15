package com.design.factoryabstract.impls;

import com.design.factoryabstract.Tablet;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 17:38
 * @Description:产品角色：苹果平板电脑
 */
public class IphoneTable implements Tablet {

    @Override
    public void display() {
        System.out.println("我是一个苹果平板电脑");
    }
}