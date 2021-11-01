package com.company;

public class Tea implements Drink {


    @Override
    public String description() {
        return "Tea";
    }

    @Override
    public double cost() {
        return 0.75;
    }
}
