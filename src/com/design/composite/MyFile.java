package com.design.composite;

/**
 * @Auther: chuan
 * @Date: 2019/9/8 21:55
 * @Description:  文件类：没有添加删除、获取子类的方法
 */
public class MyFile extends IFile{

    private String name;

    public MyFile(String name) {
        this.name = name;
    }

    @Override
    void display() {
        System.out.println(name);
    }
}