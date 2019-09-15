package com.design.state;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 17:33
 * @Description: 具体状态类：早餐
 */
public class BreakfastState extends  State{

    @Override
    public void doSomething(Food food) {
           if (food.getHour() == 7){
               System.out.println("现在是早餐时间");
           }else{
               LunchState lunchState = new LunchState();
               lunchState.doSomething(food);
           }
    }
}