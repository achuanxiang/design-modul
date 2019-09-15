package com.design.builder;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 11:56
 * @Description:  产品角色：房子
 */
public class House {

    //地板
    private String floor;

    //墙
    private String wall;

    //屋顶
    private String roof;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor='" + floor + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
}