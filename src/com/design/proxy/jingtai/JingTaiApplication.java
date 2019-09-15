package com.design.proxy.jingtai;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 17:35
 * @Description:
 */
public class JingTaiApplication {

    public static void main(String[] args) {
        ProxyBookSubject proxyBookSubject = new ProxyBookSubject();
        System.out.println("这本书卖了" + proxyBookSubject.sell() + "元");
    }

}