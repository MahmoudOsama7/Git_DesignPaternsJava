package com.company;

public class PizzaHamza implements IPizzaFactory{

    private final IPizza iDoublePizza;

    public PizzaHamza(IPizza iPizza) {
        this.iDoublePizza = iPizza;
        getPizza();
    }

    @Override
    public IPizza getPizza() {
        System.out.println("This Pizza Hamza");
        return iDoublePizza.preparePizza();
    }

    @Override
    public IPizza getPizzaComponent() {
        return null;
    }

}
