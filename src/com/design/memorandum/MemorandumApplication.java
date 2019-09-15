package com.design.memorandum;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 16:31
 * @Description:
 */
public class MemorandumApplication {

    public static void main(String[] args) {
          People people = new People("张三",34,"男");
          //备份
          Memento memento = people.backUp();
          System.out.println(people);
          System.out.println("备份之前的属性");
          //修改
          people.setName("zhangsan");
          people.setSex("女");
          people.setAge(12);
          System.out.println(people);
          System.out.println("备份之后修改后的属性");
          //还原备份
          people.restore(memento);
          System.out.println(people);
          System.out.println("备份还原后的属性");
    }

}