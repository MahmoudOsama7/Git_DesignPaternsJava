package com.company;

import java.util.ArrayList;

/*
1-first we create two objects one as Pancake which is object that implement interface Menu
and second that is dinerMenu that is object that implement interface Menu also
along side in the initialization , for Pancake the constructor is designed to add 3 elements in the array list of Pancake
and for the DinerMenu designed to add 3 elements in the array
2-then create Arraylist that hold data of type Menu interface so can hold either Pancake or dinerMenu
3-then add in this list the two objects that are dinerMenu and PancakeHouseMenu
then call the object waiter and pass to it the array that now contain the two objects DinerMenu and PancakeHouseMenu
then in the class Waitress the method creatingIteratorForList designed to loop in this array and then take each object alone
then call the method createIterator , as to convert the data of the arraylist or array into iterator

 */


public class Main {

    public static void main(String[] args) {
	    PancakeHouseMenu pancakeHouseMenu= new PancakeHouseMenu(); //object of pancake so now three elements in arraylist of
        //Pancake
	    DinerMenu dinerMenu= new DinerMenu(); //object of dinerMenu so now three elements in array of pancake
        ArrayList<Menu>menus=new ArrayList<>(); //arraylist menu of type Menu interface that is the type of either
        //dinerMenu or Pancake so generic
        menus.add(pancakeHouseMenu); //menus variable of type arraylist of type Menu interface now will contain the two
        //objects pancake and dinerMenu
        menus.add(dinerMenu);
        //creating object of type waitress and give it the arraylist that contain the two objects pancake and dinerMenu
        Waitress waitress= new Waitress(menus);
        //will use this method as to create iterator inside to iterate in the list menu data and then
        //pass each object to another method to print the data inside it by calling the method createIterator
        //that will return the iterator that contain all the data inside either the arraylist of Pancake or
        //array inside DinerMenu objects
        waitress.creatingIteratorForList();
    }
}
