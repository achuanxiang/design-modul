package com.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: chuan
 * @Date: 2019/9/8 21:58
 * @Description: 目录：有添加、删除、获取子类的方法
 */
public class MyFloder extends IFile{

    private String name;

    private List<IFile> childrens;

    public MyFloder(String name) {
        this.name = name;
        childrens = new ArrayList<IFile>();
    }

    @Override
    void display() {
        System.out.println(name);
    }

    @Override
    void add(IFile file) {
        childrens.add(file);
    }

    @Override
    void remove(IFile file) {
        childrens.remove(file);
    }

    @Override
    List<IFile> getChildren() {
        return childrens;
    }
}