package com.design.singleton;

/**
 * @Auther: chuan
 * @Date: 2019/9/2 22:11
 * @Description:
 */
public class SingletonApplication {

    public static void main(String[] args) {
        People people1 = People.getPeople();
        People people2 = People.getPeople();
        people1.setName("张三");
        people2.setName("李四");
        System.out.println("people1 = " + people1.getName());
        System.out.println("people2 = " + people2.getName());
        System.out.println("=================================");
        Student student1 = Student.getStudent();
        Student student2 = Student.getStudent();
        student1.setName("小微同学");
        student2.setName("小明同学");
        System.out.println("student1 = " + student1.getName());
        System.out.println("student2 = " + student2.getName());
        System.out.println("=================================");
        Teacher teacher1 = Teacher.getTeacher();
        Teacher teacher2 = Teacher.getTeacher();
        teacher1.setName("王老师");
        teacher2.setName("李老师");
        System.out.println("teacher1 = " + teacher1.getName());
        System.out.println("teacher2 = " + teacher2.getName());
        System.out.println("==================================");
    }

}