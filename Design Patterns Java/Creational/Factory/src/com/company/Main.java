package com.company;

public class Main {

    public static void main(String[] args) {
    //i have one class type to create object from
    //so as primos pizza when i have object created from PizzaPrimos
    //so it will be done because once creating object and passing type of pizza i will create it
    //the only difference between this and abstract factory design pattern is that
    //in abstract i have many factories so Primos and PaPaJones
    //i want to reach certain PizzaFactory and inform it
    // so i'm creating object and passing the pizza then
    //I'm telling the restaurant to prepare the needed Pizza
    //so the class from the inside will call method getPizzaToPrepare needed pizza i'm not doing this
    //but it's additonla method , in abstract i'm telling the restaurant i need pizza from you
    //the restaurant will deal with it's type and prepare it and get it for me
	PizzaPrimos pizzaPrimos=new PizzaPrimos(new PizzaSeaRanch());
	System.out.println(pizzaPrimos);
    }
}
