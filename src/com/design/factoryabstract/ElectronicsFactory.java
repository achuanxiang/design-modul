package com.design.factoryabstract;
/*/**
 * @Description  ：抽象工厂角色：电子产品生产接口
 * @author       : chuan
 * @param        :
 * @return       :
 * @exception    :
 */
public interface ElectronicsFactory {

    Electronics getCall();

    Electronics getTable();

    Electronics getComputer();

}
