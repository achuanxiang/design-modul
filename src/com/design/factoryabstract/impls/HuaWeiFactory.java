package com.design.factoryabstract.impls;

import com.design.factoryabstract.Electronics;
import com.design.factoryabstract.ElectronicsFactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 17:44
 * @Description: 具体工厂角色：华为工厂
 */
public class HuaWeiFactory implements ElectronicsFactory {

    @Override
    public Electronics getCall() {
        return new HuaWeiCall();
    }

    @Override
    public Electronics getTable() {
        return new HuaWeiTable();
    }

    @Override
    public Electronics getComputer() {
        return new HuaWeiComputer();
    }
}