package com.design.builder;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 12:04
 * @Description: 具体建造者：别墅工程队
 */
public class VillaBuilder implements HouseBuilder{

    House house = new House();

    @Override
    public void doFloor() {
        house.setFloor("别墅：地板");
    }

    @Override
    public void doWall() {
        house.setWall("别墅：墙");
    }

    @Override
    public void doRoof() {
        house.setRoof("别墅：屋顶");
    }

    @Override
    public House getHouse() {
        return house;
    }

}