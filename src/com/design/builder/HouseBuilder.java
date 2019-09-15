package com.design.builder;
/*/**
 * @Description  ：建造者接口：房屋建造
 * @author       : chuan
 * @param        : 
 * @return       : 
 * @exception    :
 */
public interface HouseBuilder {

    void doFloor();

    void doWall();

    void doRoof();

    House getHouse();

}
