package com.design.builder;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 12:06
 * @Description:  具体建造者：城中村工程队
 */
public class VillageBuilder implements HouseBuilder{

    House house = new House();

    @Override
    public void doFloor() {
        house.setFloor("城中村：地板");
    }

    @Override
    public void doWall() {
        house.setWall("城中村：墙");
    }

    @Override
    public void doRoof() {
        house.setRoof("城中村：屋顶");
    }

    @Override
    public House getHouse() {
        return house;
    }

}