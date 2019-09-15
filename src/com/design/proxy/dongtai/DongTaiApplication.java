package com.design.proxy.dongtai;

import javax.security.auth.Subject;
import java.lang.reflect.Proxy;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 17:35
 * @Description:
 */
public class DongTaiApplication {

    public static void main(String[] args) {
           RealBookSubject realBookSubject = new RealBookSubject();
           ProxyBookSubject proxyBookSubject = new ProxyBookSubject();
           proxyBookSubject.setRealBookSubject(realBookSubject);
           BookSubject bookSubject = (BookSubject) Proxy.newProxyInstance(RealBookSubject.class.getClassLoader(),realBookSubject.getClass().getInterfaces(),proxyBookSubject);
           System.out.println("这个商品卖：" + bookSubject.sell());
    }

}