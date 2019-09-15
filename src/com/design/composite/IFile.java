package com.design.composite;

import java.util.List;

public abstract class IFile {

    void display(){};

    void add(IFile file){};

    void remove(IFile file){};

    List<IFile> getChildren(){return null;};

}
