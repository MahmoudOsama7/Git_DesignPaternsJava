package com.company;

//here i can only add the drink alone without any addional things
public class Espresso implements Drink {
    @Override
    public String description() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
