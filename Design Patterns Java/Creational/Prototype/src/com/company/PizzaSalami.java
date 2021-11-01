package com.company;

public class PizzaSalami extends IPizza{

    public PizzaSalami()
    {
        preparePizza();
    }

    @Override
    IPizza preparePizza() {
        System.out.println("Pizza Salami Will be Prepared");
        return this;
    }
}
