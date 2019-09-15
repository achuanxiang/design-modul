package com.design.state;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 17:35
 * @Description: 具体状态处理类：晚餐
 */
public class DinnerState extends State {

    @Override
    public void doSomething(Food food) {
        if (food.getHour() == 18){
            System.out.println("现在是晚餐时间");
        }else{
            NoState noState = new NoState();
            noState.doSomething(food);
        }
    }
}