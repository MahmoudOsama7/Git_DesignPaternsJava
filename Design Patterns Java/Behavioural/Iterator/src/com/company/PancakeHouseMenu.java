package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    //list of variables of type menuItem class and called menuItems
    ArrayList<MenuItem>menuItems;

    public PancakeHouseMenu() {
        menuItems=new ArrayList<>();//initialization of the list
        //adding items in the list by calling the method addItem and give it the needed data
        addItem("mahmoud","osama",true,0.0);
        addItem("ahmed","osama",true,0.1);
        addItem("areej","osama",true,0.2);

    }
    public void addItem(String name,String description,boolean vegetarian,double price)
    {
        //receiving data from the method by creating object of class menuItem and then add it to the list menuItems
        MenuItem menuItem= new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }


    @Override
    public Iterator<MenuItem> createIterator() {
        //return an iterator of the menuItems list
        return menuItems.iterator();
    }
}
