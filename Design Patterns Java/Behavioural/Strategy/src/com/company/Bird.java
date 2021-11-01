package com.company;

public class Bird extends Duck {
    public Bird(FlyBehaviour flyBehaviour,QuackBehaviour quackBehaviour)
    {
        this.flyBehaviour=flyBehaviour;
        this.quackBehaviour=quackBehaviour;
    }
}
