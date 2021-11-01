package com.company;

//class describe pizza of type Chicken
//implements the interface IPizza as to use the method prepare pizza to state that this is ChickenPizza
//we can describe more attributes to this class like the sauce for ex
//any modification in this class will not result a problem in the client codes because what they want is the object i'm
//creating here in the end
//return this or return return new instance will result in object reference , either it's same reference (return this )
//or another instance (return new instance with different reference)
public class PizzaChicken implements IPizza {
    @Override
    public IPizza preparePizza() {
        System.out.println("Pizza Chicken Is Prepared For You");
        return this;
    }
}
