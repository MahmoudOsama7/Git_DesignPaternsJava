package com.company;

public class PizzaPrimos implements IPizzaFactory{
    //this class implements the methods found in interface IPizzaFactory
    //the method now determine the type of pizza that will be returned
    //so the implementation is returning new type of interface IPizza
    //as we mentioned we cannot return object of type interface
    //we return object of type one of the classes that implementing the interface and this case
    //PizzaSeaRanch or PizzaChicken
    //the type of object either seaRanch or Chicken will be sent from client code (PizzaHeadQuarterCode)
    //the variable iPizza of type interface IPizza will be equalized with the new instance passed by the client code in main
    //so now PaPaJones pizza have reference to the pizza the customer asked about
    //thanks to the parameter passed iPizza that is from beginning was either new PizzaChicken or new SeaRanch which are the
    //two classes implementing the interface IPizza
    //this.iPizza=iPizza; this is actually now equal to
    //this.iPizza=new PizzaChicken; or this.iPizza=PizzaSeaRanch;
    //so now for ex IPizza is object of PizzaChicken so can call the method inside it like Prepare Pizza
    //will make this happen inside the method getPizza that is found here in PaPaJones Class
    //and will do that return iPizza.preparePizza();
    private final IPizza iPizza;

    public PizzaPrimos(IPizza iPizza) {
        this.iPizza = iPizza;
        //iPizzaFactory1.getPizza(); however this method ie better to be called from outside
        //to leave everything for the main to just create new object and don't care to call certain method
        getPizza();
    }

    @Override
    public IPizza getPizza() {
        System.out.println("This is Primos Pizza");
        return iPizza.preparePizza();
    }

    @Override
    public IPizza getPizzaComponent() {
        return null;
    }
}
