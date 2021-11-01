package com.company;

public abstract class CaffeineBeverage {
    //final as not to be changed , the method will remain the same and do the same steps in each beverage
    final void prepare()
    {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();

    void boilWater()
    {
        System.out.println("Boiling Water...");
    }
    void pourInCup()
    {
        System.out.println("Pouring In Cup");
    }

}
