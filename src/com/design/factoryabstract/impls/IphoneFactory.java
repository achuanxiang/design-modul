package com.design.factoryabstract.impls;

import com.design.factoryabstract.Electronics;
import com.design.factoryabstract.ElectronicsFactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 17:46
 * @Description: 具体工厂角色：苹果工厂
 */
public class IphoneFactory implements ElectronicsFactory {

    @Override
    public Electronics getCall() {
        return new IphoneCall();
    }

    @Override
    public Electronics getTable() {
        return new IphoneTable();
    }

    @Override
    public Electronics getComputer() {
        return new IphoneComputer();
    }
}