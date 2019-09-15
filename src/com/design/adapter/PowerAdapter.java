package com.design.adapter;

/**
 * @Auther: chuan
 * @Date: 2019/9/11 15:13
 * @Description: 类适配器
 */
public class PowerAdapter extends  ChinaPowerImpl implements  AmericanPower{

    @Override
    public void do110V() {
        this.do220V();
    }
}