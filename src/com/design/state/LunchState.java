package com.design.state;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 17:35
 * @Description: 具体状态类：午餐
 */
public class LunchState extends State {

    @Override
    public void doSomething(Food food) {
          if(food.getHour() == 12){
              System.out.println("现在是午餐时间");
          }else{
              DinnerState dinnerState = new DinnerState();
              dinnerState.doSomething(food);
          }
    }
}