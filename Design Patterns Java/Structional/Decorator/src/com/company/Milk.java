package com.company;

//here i can order the drink with the addional things and that is why i have reference to the drink again to use it
public class Milk implements Drink{
    Drink drink;
    public Milk(Drink drink)
    {
        this.drink = drink;
    }
    @Override
    public String description() {
        return drink.description()+" Milk";
    }

    @Override
    public double cost() {
        return drink.cost() +0.30;
    }
}
