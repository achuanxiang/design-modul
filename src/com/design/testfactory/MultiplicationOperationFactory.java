package com.design.testfactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 21:50
 * @Description: 具体工厂角色：乘法生产工厂
 */
public class MultiplicationOperationFactory implements  OperationFactory {

    @Override
    public Operation getOperation() {
        return new MultiplicationOperation();
    }
}