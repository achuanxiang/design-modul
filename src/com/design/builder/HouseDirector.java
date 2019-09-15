package com.design.builder;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 12:07
 * @Description:  决策者：工程师
 */
public class HouseDirector {

    public House buildHouse(HouseBuilder houseBuilder){
        houseBuilder.doFloor();
        houseBuilder.doRoof();
        houseBuilder.doWall();
        return  houseBuilder.getHouse();
    }
}