package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //here i can say double Mocha + Espresso
        Drink drink = new Mocha(new Mocha(new Espresso()));
        System.out.println(drink.description());
        System.out.println(drink.cost());
        //here i can say Single Mocha + Espresso
        Drink drink1= new Mocha(new Espresso());
        System.out.println(drink1.description());
        System.out.println(drink1.cost());
        //here i can order single milk + espresso
        Drink drink2= new Milk(new Espresso());
        System.out.println(drink2.description());
        System.out.println(drink2.cost());
        //here i can order single milk + single milk + espresso
        Drink drink3 = new Milk(new Mocha(new Espresso()));
        System.out.println(drink3.description());
        System.out.println(drink3.cost());

        Drink drink4= new Tea();
        System.out.println(drink4.description());
        System.out.println(drink4.cost());
    }
}
