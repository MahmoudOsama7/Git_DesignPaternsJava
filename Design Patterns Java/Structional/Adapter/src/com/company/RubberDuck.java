package com.company;

public class RubberDuck implements Duck{
    @Override
    public void canFly() {
        System.out.println("I Can Fly");
    }

    @Override
    public void canQuack() {
        System.out.println("I Can Quack");
    }
}
