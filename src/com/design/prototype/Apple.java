package com.design.prototype;

import java.util.List;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 10:16
 * @Description: 浅度克隆
 */
public class Apple implements Cloneable{

    private String color;

    private int weight;

    private List<Integer> size;

    public List<Integer> getSize() {
        return size;
    }

    public void setSize(List<Integer> size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    protected Apple clone(){
        try {
            return (Apple) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }
}