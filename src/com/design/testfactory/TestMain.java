package com.design.testfactory;

import java.util.Scanner;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 21:17
 * @Description:
 */
public class TestMain {

    public static void main(String[] args) {
        System.out.println("======   简单计算程序   =======");
        System.out.println("输入第一个参数：");
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        System.out.println("请输入第二个参数");
        String second = scanner.next();
        double result = 0.0;
        double one = Double.parseDouble(first);
        double two = Double.parseDouble(second);
        OperationFactory addOperationFactory = new AddOperationFactory();
        Operation addOperation = addOperationFactory.getOperation();
        addOperation.setFirst(one);
        addOperation.setSecond(two);
        System.out.println("加法运算结果 = " + addOperation.run());
        System.out.println("=====================================");
        OperationFactory subOperationFactory = new SubOperationFactory();
        Operation subOperation = subOperationFactory.getOperation();
        subOperation.setFirst(one);
        subOperation.setSecond(two);
        System.out.println("减法运算结果 = " + subOperation.run());
        System.out.println("======================================");
        OperationFactory multiplicationOperationFactory = new MultiplicationOperationFactory();
        Operation multiplicationOperation = multiplicationOperationFactory.getOperation();
        multiplicationOperation.setFirst(one);
        multiplicationOperation.setSecond(two);
        System.out.println("乘法运算结果 = " + multiplicationOperation.run());
        OperationFactory divisionOperationFactory = new DivisionOperationFactory();
        Operation divisionOperation = divisionOperationFactory.getOperation();
        divisionOperation.setFirst(one);
        divisionOperation.setSecond(two);
        System.out.println("除法运算结果 = " + divisionOperation.run());
    }

}