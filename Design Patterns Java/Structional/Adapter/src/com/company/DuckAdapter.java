package com.company;
//Adapter class that will convert the methods of Eagle to be methods of Duck
public class DuckAdapter implements Duck{
    //Eagle instance reference
    Eagle eagle;

    //constructor as to inform that we want to adapt the class eagle so the client code must inform it's an eagle
    public DuckAdapter(Eagle eagle) {
        this.eagle = eagle;
    }
    //Eagle can fly but not like the duck
    @Override
    public void canFly() {
        eagle.fly();
    }
    //Eagle can't quack it has another sound
    @Override
    public void canQuack() {
        eagle.quack();
    }
}
