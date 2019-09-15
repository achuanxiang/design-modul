package com.design.factoryabstract.impls;

import com.design.factoryabstract.Call;
import com.design.factoryabstract.Electronics;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 17:27
 * @Description:产品角色：华为手机
 */
public class HuaWeiCall implements Call {

    @Override
    public void display() {
        System.out.println("我是一个华为手机");
    }
}