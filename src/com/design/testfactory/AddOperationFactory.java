package com.design.testfactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 21:48
 * @Description: 具体工厂角色：加法生产工厂
 */
public class AddOperationFactory implements OperationFactory {

    @Override
    public Operation getOperation() {
        return new AddOperation();
    }
}