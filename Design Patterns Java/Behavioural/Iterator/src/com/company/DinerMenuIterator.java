package com.company;
//we use it to convert the array to be easily iterate in it just like arrayList
import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[]list;
    int position=0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(position>=list.length||list[position]==null)
        {
            System.out.println("False");
            return false;
        }
        else
        {
            System.out.println("True");
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem=list[position];
        position=position+1;
        return menuItem;
    }

}
