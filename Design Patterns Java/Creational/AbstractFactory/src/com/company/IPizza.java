package com.company;

//the interface will determine which pizza we need to use
public interface IPizza {
    //this method will be implemented by pizza classes to prepare each type of pizza based on class type
    //pizzaChicken class will prepare PizzaChicken object
    //PizzaSeaRanch class will prepare PizzaSeaRanch object
    //last note that any class pizza that implements the interface is force to have the same properties
    IPizza preparePizza();
}
