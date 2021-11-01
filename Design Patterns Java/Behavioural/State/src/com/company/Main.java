package com.company;

public class Main {

    public static void main(String[] args) {
	    GumballMachine gumballMachine=new GumballMachine(10);
		System.out.println(gumballMachine.getState());
	    gumballMachine.insertQuarter();
		System.out.println(gumballMachine.getState());
	    gumballMachine.turnCrank();
		System.out.println(gumballMachine.getState());
		System.out.println(gumballMachine.getCount());
		System.out.println(gumballMachine.getState());

	    gumballMachine.insertQuarter();
	    gumballMachine.ejectQuarter();
		System.out.println(gumballMachine.getCount());
		System.out.println(gumballMachine.getState());

	    gumballMachine.insertQuarter();
	    gumballMachine.turnCrank();
	    System.out.println(gumballMachine.getCount());
		System.out.println(gumballMachine.getState());

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getState());

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getCount());
		System.out.println(gumballMachine.getState());

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getCount());
		System.out.println(gumballMachine.getState());

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getCount());
		System.out.println(gumballMachine.getState());

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getCount());
		System.out.println(gumballMachine.getState());

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getCount());
		System.out.println(gumballMachine.getState());

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getCount());
		System.out.println(gumballMachine.getState());

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.getCount());
		System.out.println(gumballMachine.getState());

		gumballMachine.refill();
		System.out.println(gumballMachine.getCount());
		System.out.println(gumballMachine.getState());
    }
}
