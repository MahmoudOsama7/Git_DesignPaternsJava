package com.company;

public class PizzaSeaRanch implements IPizza {
    @Override
    public IPizza getPizza() {
        System.out.println("PizzaChicken Will Be Prepared");
        return this;
    }
}
