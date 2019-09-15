package com.design.testfactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 21:49
 * @Description: 具体工厂角色：减法生产工厂
 */
public class SubOperationFactory implements  OperationFactory{

    @Override
    public Operation getOperation() {
        return new SubOperation();
    }
}