package com.company;
/*
we have interfaces for properties that will change by future
we have classes that implement this interface as to do many behaviour of the same interface type
like FlyBehaviour Interface , we can fly and we can not
we have abstract class that contain reference of the interfaces like FlyBehaviour and QuackBehaviour and is presented as
superClass
we have subClasses which is the final object we want as RubberDuck
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        //here i created object of type RubberDuck
        //so the methods are
        //FlyBehaviour = flyNoWay
        //QuackBehaviour = Quack

        Duck d=new RubberDuck(new FlyNoWay(),new Quack());
        d.performFly();
        d.performQuack();
        //this is used if we want to update certain properties of duck
        //for example the duck now can fly and before it could not and it was doing quack and now it's silent
        //d.setFlyBehaviour(new FlyWithWings());
        //d.setQuackBehaviour(new MuteQuack());
        //d.performFly();
        //d.performQuack();

        Duck b=new Bird(new FlyWithWings(),new MuteQuack());
        b.performFly();
        b.performQuack();
    }
}
