package com.company;

//this interface will contain method that will return object of the interface IPizza
//however we do not have object of interface
//so it will return object of type one of the classes implementing it
//in this case it will return either object PizzaChicken or PizzaSeaRanch
//last note that any class PizzaFactory as primos that implements the interface is force to have the same properties
//after abstract design pattern the pizzaFactory now have reference to pizza and sauce
public interface IPizzaFactory {
    IPizza getPizza();
    IPizza getPizzaComponent();

}
