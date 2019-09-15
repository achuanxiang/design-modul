package com.design.adapter;

/**
 * @Auther: chuan
 * @Date: 2019/9/11 15:51
 * @Description: 对象适配器
 */
public class AmericanAdapter implements AmericanPower {

    private ChinaPower chinaPower;

    public AmericanAdapter() {
        chinaPower = new ChinaPowerImpl();
    }

    @Override
    public void do110V() {
        chinaPower.do220V();
    }
}