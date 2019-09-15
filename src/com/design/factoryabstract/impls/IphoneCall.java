package com.design.factoryabstract.impls;

import com.design.factoryabstract.Call;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 17:36
 * @Description:产品角色：苹果手机
 */
public class IphoneCall implements Call {

    @Override
    public void display() {
        System.out.println("我是一个苹果手机");
    }
}