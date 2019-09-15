package com.design.adapter;

/**
 * @Auther: chuan
 * @Date: 2019/9/11 14:59
 * @Description:  适配者接口实现类：中国电压
 */
public class ChinaPowerImpl implements  ChinaPower {

    @Override
    public void do220V() {
        System.out.println("可以使用220V电压");
    }
}