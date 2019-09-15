package com.design.factoryabstract;

import com.design.factoryabstract.impls.HuaWeiFactory;
import com.design.factoryabstract.impls.IphoneFactory;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 17:21
 * @Description:
 */
public class FactoryAbstractApplication {

    public static void main(String[] args) {
         ElectronicsFactory huaweiFactory = new HuaWeiFactory();
         Electronics huaweiCall = huaweiFactory.getCall();
         Electronics huaweiTable = huaweiFactory.getTable();
         Electronics huaweiComputer = huaweiFactory.getComputer();
         huaweiCall.display();
         huaweiTable.display();
         huaweiComputer.display();
         System.out.println("====================================");
         ElectronicsFactory iphoneFactory = new IphoneFactory();
         Electronics iphoneCall = iphoneFactory.getCall();
         Electronics iphoneComputer = iphoneFactory.getComputer();
         Electronics iphoneTable = iphoneFactory.getTable();
         iphoneCall.display();
         iphoneTable.display();
         iphoneComputer.display();

}

}