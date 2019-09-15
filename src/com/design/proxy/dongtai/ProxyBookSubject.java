package com.design.proxy.dongtai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 17:41
 * @Description:  代理类角色：图书馆、当当网
 */
public class ProxyBookSubject implements InvocationHandler {

    private RealBookSubject realBookSubject;

    public void setRealBookSubject(RealBookSubject realBookSubject) {
        this.realBookSubject = realBookSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
         Object result = null;
         result = method.invoke(realBookSubject,args);
         return  result;
    }

    /*/**
     * @Description  ：获取代金券的金额
     * @author       : chuan
     * @param        :
     * @return       :
     * @exception    :
     */
    private int getVoucher(){
        return  10;
    }
}