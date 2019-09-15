package com.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 10:03
 * @Description:
 */
public class PrototypeApplication {

    public static void main(String[] args) {
           System.out.println("=========  浅度克隆  =========");
           Apple apple1 = new Apple();
           apple1.setColor("red");
           apple1.setWeight(34);
           List<Integer> size = new ArrayList<Integer>();
           size.add(1);
           size.add(2);
           size.add(3);
           apple1.setSize(size);
           Apple apple2 = apple1.clone();
           System.out.println("apple1是否与apple2相等：" + apple1.equals(apple2));
           apple2.setColor("blue");
           apple1.setWeight(20);
           size.add(5);
           apple1.setSize(size);
           System.out.println("apple1 = "+apple1);
           System.out.println("apple2 = "+apple2);
           System.out.println("=========  深度克隆  =========");
           Banana banana1 = new Banana();
           banana1.setColor("green");
           banana1.setWeight(45);
           List<Integer> bananaSize = new ArrayList<Integer>();
           bananaSize.add(1);
           bananaSize.add(3);
           banana1.setSize(bananaSize);
           Banana banana2 = banana1.clone();
           System.out.println("banana1和banana2是否相等：" + banana1.equals(banana2));
           banana1.setColor("orange");
           bananaSize.add(7);
           banana1.setSize(bananaSize);
           System.out.println("banana1 = " + banana1);
           System.out.println("banana2 = " + banana2);
    }

}