package com.company;

public class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck()
    {

    }
    public void performQuack()
    {
        quackBehaviour.quack();
    }
    public void performFly()
    {
        flyBehaviour.fly();
    }
    public void setFlyBehaviour(FlyBehaviour fb)
    {
        flyBehaviour=fb;
    }
    public void setQuackBehaviour(QuackBehaviour qb)
    {
        quackBehaviour=qb;
    }
}
