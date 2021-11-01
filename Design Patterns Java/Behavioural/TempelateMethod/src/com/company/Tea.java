package com.company;

public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Steeping The Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon...");
    }
}
