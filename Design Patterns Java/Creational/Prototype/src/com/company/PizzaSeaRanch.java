package com.company;

public class PizzaSeaRanch extends IPizza{
    public PizzaSeaRanch()
    {
        preparePizza();
    }

    @Override
    IPizza preparePizza() {
        System.out.println("Pizza SeaRanch Will Be Prepared");
        return this;
    }
}
