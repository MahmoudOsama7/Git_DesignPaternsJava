package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu>menus; //arraylist of type menu interface so can contain the two objects Pancake and dinerMenu
    public Waitress(ArrayList<Menu>menu)
    {
        //equalizing the list passed by constructor to arraylist holding data of type Menu that can be either Pancake or
        //dinerMenu
        this.menus=menu;
    }
    //this method is is talking object by another by using the iterator method , so iterator to object to iterator 2
    //object 1 is pancakeMenu and object 2 is dinerMenu
    public void creatingIteratorForList()
    {


        //creating iterator interface object of type arraylist menu iterator to loop in it

        //hasNext make sure that there is a next value in the list of type iterator now
        //since we have two objects of type menuItem
        //so will use the concept of iterator here also
        //if
        //put the value found of type menu in an object of menu that now is
        for (Menu menu : menus) {
            //it will get each object stored in the menu that was stored before in menus.iterator in line number 15
            //either Pancake or Diner
            //return the list of type iterator after adding the current item in the iterator
            //so now the method createIterator returns iterator of either ArrayList or Array
            //so we can use it to pass it to method printMenuData as it will pass object
            //then will print the data of this object by the method printMenuData
            //then will the method printMenuData and pass to it the iterator of type menu that is either Pancake
            //or dinerMenu as to print and then in the method i will take each object and use it's inside data to be printed
            printMenuData(menu.createIterator());
        }
    }

    //printing the data related to each item after iterating in the array or arraylist depending on the
    //iterator returned
    public void printMenuData(Iterator<MenuItem>iterator)
    {
        while (iterator.hasNext())
        {
            MenuItem menuItem=iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getDescription());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.isVegetarian());
        }
    }
}
