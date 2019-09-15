package com.design.singleton;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 09:15
 * @Description: 双重检查单例模式
 */
public class Teacher {

    private String name;

    private static Teacher teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Teacher(){}

    public static Teacher getTeacher(){
        if (teacher == null){
            synchronized (Teacher.class){
                if (teacher == null){
                    teacher = new Teacher();
                }
            }
        }
        return teacher;
    }

}