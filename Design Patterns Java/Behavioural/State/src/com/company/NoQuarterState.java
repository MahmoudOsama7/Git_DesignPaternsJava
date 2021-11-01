package com.company;


//the state the customer has not inserted a quarter
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    //to create reference of gumballMachine in the No Quarter class
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You Inserted A Quarter");
        gumballMachine.state= gumballMachine.getHasQuarterState(); //now the coin inserted so will change the state to another state that machine now
        //has a coin (quarter)
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You Have Not Inserted A Quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You Turned The Crank But With No Quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You Need To Pay First");
    }
}
