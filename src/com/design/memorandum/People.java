package com.design.memorandum;

/**
 * @Auther: chuan
 * @Date: 2019/9/12 16:32
 * @Description:
 */
public class People {

    private String name;

    private int age;

    private String sex;

    public People(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //备份
    public Memento backUp(){
        return  new Memento(name,age,sex);
    }

    //恢复备份
    public void restore(Memento memento){
        this.name = memento.getName();
        this.age = memento.getAge();
        this.sex = memento.getSex();
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}