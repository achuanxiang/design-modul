package com.design.mediator;

/**
 * @Auther: chuan
 * @Date: 2019/9/11 22:28
 * @Description:
 */
public class MediatorApplication {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Man lisi = new Man("李四",5,mediator);
        Women xiaofang = new Women("小芳",5,mediator);

        lisi.match(xiaofang);

    }

}