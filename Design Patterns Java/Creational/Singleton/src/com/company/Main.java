package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //here will not say as usual as SingleClass singleClass = new SingleClass
        //will declare variable of type SingleClass and will waiting value to what comes from method getInstance
        //that is now belongs to SingleClass as static and no need to create object
        SingleClass singleClass=SingleClass.getInstance();
        SingleClass singleClass1=SingleClass.getInstance();
        singleClass.id=5;
        System.out.println(singleClass.id);
        System.out.println(singleClass1.id);
        singleClass1.id=6;
        System.out.println(singleClass.id);
        System.out.println(singleClass1.id);
        System.out.println(singleClass==singleClass1);
        System.out.println(singleClass1);
        //since single objects already created so whatever we create new objects still the same object with same reference is used
        //so changing in class parameter by one object , will reflect for all other objects
        //because now all are the same so all have the same values
    }
}
