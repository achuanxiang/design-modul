package com.design.proxy.dongtai;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 17:40
 * @Description: 被代理角色：图书供应商
 */
public class RealBookSubject implements BookSubject {

    @Override
    public int sell() {
        return 60;
    }
}