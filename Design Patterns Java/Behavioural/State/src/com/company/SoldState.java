package com.company;
//the state now is the customer inserted a quarter and turned the crank and waiting for gumball
public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please Wait We're Already Giving You A Gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry You Already Turned The Crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning Twice Does Not Give You Another Gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.count>0)
        {
            gumballMachine.state= gumballMachine.getNoQuarterState();
        }
        else
        {
            System.out.println("The Machine Is Out Of Gumballs");
            gumballMachine.state= gumballMachine.getSoldOutState();
        }
    }
}
