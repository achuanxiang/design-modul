package com.design.composite;

import java.util.List;

/**
 * @Auther: chuan
 * @Date: 2019/9/8 17:58
 * @Description:
 */
public class CompositeApplication {

    public static void main(String[] args) {
          IFile root = new MyFloder("c://盘");
          IFile testFile = new MyFile("test.txt");
          IFile testFloder = new MyFloder("迅雷下载");
          root.add(testFile);
          root.add(testFloder);
          IFile abcFile = new MyFloder("abc.txt");
          testFloder.add(abcFile);

          treeDispaly(root);
    }

    public static void treeDispaly(IFile root){
         root.display();
         List<IFile> rootChildren = root.getChildren();
         for (IFile rootChild : rootChildren) {
              if (rootChild instanceof  MyFile){
                  rootChild.display();
              }else{
                  treeDispaly(rootChild);
              }
         }
    }

}