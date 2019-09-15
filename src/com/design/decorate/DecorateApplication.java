package com.design.decorate;

/**
 * @Auther: chuan
 * @Date: 2019/9/3 13:49
 * @Description:
 */
public class DecorateApplication {

    public static void main(String[] args) {
        Animal animal = new AnimalImpl();
        animal.show();
        System.out.println("=====================");
        Animal flyAnimal = new FlyDecorate(animal);
        Animal runAnimal = new RunDecorate(flyAnimal);
        Animal swimAnimal = new SwimDecorate(runAnimal);
        swimAnimal.show();
    }

}