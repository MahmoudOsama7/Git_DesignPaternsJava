package com.company;

//the state that the machine has no gumballs to give
public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You Can Not Insert Quarter , The Machine Is In Sold Out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You Can Not Eject as You Have Not Inserted A Quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You Turned But There Is No Gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No Gumballs Dispensed");
    }
}
