package com.company;

//interface has 3 methods , adding new observer , remove observer and notify observers if there is a change
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
