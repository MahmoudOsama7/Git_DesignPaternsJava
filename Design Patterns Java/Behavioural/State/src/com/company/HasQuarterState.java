package com.company;

//the state now that customer inserted a quarter only
public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("There is already Quarter You Can not insert again");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter Returned");
        gumballMachine.state= gumballMachine.getNoQuarterState();
    }

    @Override
    public void turnCrank() {
        System.out.println("You Turned The Crank");
        gumballMachine.state=gumballMachine.getSoldState();

    }

    @Override
    public void dispense() {
        System.out.println("No Gumball Dispensed");
    }
}
