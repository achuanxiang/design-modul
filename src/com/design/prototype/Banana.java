package com.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 10:41
 * @Description: 深度克隆
 */
public class Banana implements Cloneable {

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
    protected Banana clone(){
        try {
            Banana banana = (Banana) super.clone();
            List<Integer> size = new ArrayList<>();
            for (Integer integer : this.getSize()) {
                 size.add(integer);
            }
            banana.setSize(size);
            return banana;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Banana{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }
}