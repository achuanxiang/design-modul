package com.design.proxy.jingtai;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 17:41
 * @Description:  代理类角色：图书馆、当当网
 */
public class ProxyBookSubject implements BookSubject{

    private RealBookSubject realBookSubject;

    @Override
    public int sell() {
        if (realBookSubject == null){
            realBookSubject = new RealBookSubject();
        }
        return realBookSubject.sell() - getVoucher();
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