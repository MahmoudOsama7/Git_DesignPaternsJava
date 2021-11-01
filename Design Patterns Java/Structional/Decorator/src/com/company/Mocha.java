package com.company;

//here i can order the drink with the addional things and that is why i have reference to the drink again to use it
public class Mocha implements Drink {
    Drink drink;
    public Mocha(Drink drink)
    {
        this.drink = drink;
    }

    @Override
    public String description() {
        return drink.description()+" Mocha";
    }

    public double cost()
    {
        return .20 + drink.cost();
    }
}
