package com.design.factoryabstract.impls;

import com.design.factoryabstract.Tablet;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 17:33
 * @Description:产品角色：华为平板电脑
 */
public class HuaWeiTable implements Tablet{

    @Override
    public void display() {
        System.out.println("我是一个华为平板电脑");
    }
}