package com.company;

import java.util.Iterator;

//this is a list menu list but depends on array so we need to make it use iterator as to iterate in it like arraylist
public class DinerMenu implements Menu {

    static final int MAX_ITEMS=6; //size of array
    int numberOfItems=0; //number of items in the array
    //the dinerMenu deals with array holding data of type menuItem class 
    MenuItem[] menuItems;

    public DinerMenu()
    {
        //initializing the array with the needed size
        menuItems=new MenuItem[MAX_ITEMS];
        //adding the elements in the array by calling the method addItem
        addItem("osama","osama",true,0.4);
        addItem("amal","osama",true,0.5);
        addItem("mohamed","osama",true,0.6);

    }
    public void addItem(String name,String description,boolean vegetarian,double price)
    {
        //creating new object of class MenuItem as to receive the data from calling the method addItem
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        if(numberOfItems>=6)
        {
            //array is full , cannot add it
            System.out.println("Sorry Menu Is Full");
        }
        else
        {
            //add the menuItem in the list menuItems
            menuItems[numberOfItems]=menuItem;
            //incrementing the array after adding an element
            numberOfItems=numberOfItems+1;
        }
    }

    //we don't return array we return the iterator of array as to iterate in it just like Arraylist , LinnkedList and so on
    @Override
    public Iterator<MenuItem> createIterator()
    {
        //the returned value is iterator contain the list of value found in the array menuItems
        return new DinerMenuIterator(menuItems);
    }
}
