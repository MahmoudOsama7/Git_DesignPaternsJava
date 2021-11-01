package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck d = new RubberDuck();
        d.canFly();
        d.canQuack();
        Duck e = new DuckAdapter(new Eagle());
        e.canFly();
        e.canQuack();
    }
}
