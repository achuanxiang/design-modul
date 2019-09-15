package com.design.testfactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 21:51
 * @Description: 具体工厂角色：除法生产工厂
 */
public class DivisionOperationFactory implements OperationFactory {

    @Override
    public Operation getOperation() {
        return new DivisionOperation();
    }
}