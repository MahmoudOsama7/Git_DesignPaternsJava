package com.company;

public class PizzaChicken implements IPizza {
    @Override
    public IPizza getPizza() {

        System.out.println("Pizza Sea Ranch Will Be Prepared");
        return this;
    }
}
