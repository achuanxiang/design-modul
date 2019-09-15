package com.design.adapter;

/**
 * @Auther: chuan
 * @Date: 2019/9/11 10:48
 * @Description:
 */
public class AdapterApplication {

    public static void main(String[] args) {
//          PowerAdapter powerAdapter = new PowerAdapter();
//          powerAdapter.do110V();

          AmericanAdapter americanAdapter = new AmericanAdapter();
          americanAdapter.do110V();

    }

}