package com.company;

public class GumballMachine {
    private final State soldOutState;
    private final State noQuarterState;
    private final State hasQuarterState;
    private final State soldState;
    State state;
    int count;

    public GumballMachine(int numberGumballs)
    {
        //in the constructor from beginning we are making initial state is NoQuarterState
        //so the object of state is NoQuarterState and with each operation it will change to another state like HasQuarter
        //and os on
        soldOutState= new SoldOutState(this);
        noQuarterState=new NoQuarterState(this);
        hasQuarterState= new HasQuarterState(this);
        soldState= new SoldState(this);
        this.count=numberGumballs;
        if(numberGumballs>0)
        {
            state=noQuarterState;//here the state reference will be noQuarter state interface that is now a
            //new object of type NoQuarterState
        }
        else
        {
            state=soldOutState;
        }
    }
    public void insertQuarter()
    {
        state.insertQuarter();
    }
    public void ejectQuarter()
    {
        state.ejectQuarter();
    }
    public void turnCrank()
    {
        state.turnCrank();
        state.dispense();
    }
    public void releaseBall()
    {
        System.out.println("Gumball comes rolling out the slot...");
        if(count!=0)
        {
            count=count-1;
        }
    }
    public int getCount()
    {
        return count;
    }
    public void refill()
    {
        this.count+=10;
        System.out.println("The gumball now is refilled , the new count is :"+this.count);
        //state.refill();
    }
    public void setState(State state)
    {
        this.state=state;
    }
    public State getState()
    {
        return state;
    }
    public State getSoldOutState()
    {
        return soldOutState;
    }
    public State getNoQuarterState()
    {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }
    public State getSoldState()
    {
        return soldState;
    }
}
