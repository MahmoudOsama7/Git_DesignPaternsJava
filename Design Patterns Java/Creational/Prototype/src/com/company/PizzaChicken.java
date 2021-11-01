package com.company;

public class PizzaChicken extends IPizza{

    public PizzaChicken()
    {
        preparePizza();
    }

    @Override
    IPizza preparePizza() {
        System.out.println("Pizza Chicken Will Be Prepared");
        return this;
    }
}
