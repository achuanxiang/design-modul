package com.design.builder;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 12:01
 * @Description: 具体建造者角色：公寓建造工程队
 */
public class ApartmentBuilder implements HouseBuilder{

    House house = new House();

    @Override
    public void doFloor() {
        house.setFloor("公寓：地板");
    }

    @Override
    public void doWall() {
        house.setWall("公寓：墙");
    }

    @Override
    public void doRoof() {
        house.setRoof("公寓：屋顶");
    }

    @Override
    public House getHouse() {
        return house;
    }
}