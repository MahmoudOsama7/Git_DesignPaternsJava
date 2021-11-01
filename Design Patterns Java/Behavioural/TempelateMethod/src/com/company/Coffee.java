package com.company;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee Through Filter...");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar And Milk...");
    }
}
