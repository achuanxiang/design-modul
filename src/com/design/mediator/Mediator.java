package com.design.mediator;

/**
 * @Auther: chuan
 * @Date: 2019/9/11 22:41
 * @Description: 具体中介角色：婚介所人员
 */
public class Mediator {

    private Man man ;

    private Women women;

    public void setMan(Man man) {
        this.man = man;
    }

    public void setWomen(Women women) {
        this.women = women;
    }

    public void match(People people){
       if (people instanceof  Man){
           setMan((Man)people);
       }else{
           setWomen((Women)people);
       }

       if(man == null || women == null){
           System.out.println("我不是同性恋");
       }

       if(man.getCondition() == women.getCondition()){
           System.out.println(man.getName() + "和" + women.getName() + "绝配");
       }else{
           System.out.println(man.getName() + "和" + women.getName() + "不合适");
       }
    }
}