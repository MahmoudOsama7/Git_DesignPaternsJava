package com.company;

import java.util.ArrayList;
//weather Data by default
public class WeatherData implements Subject {
    //arraylist of type observers that we will use either to add new observer , remove old observer and so on
    private final ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    //when creating new weather data Object , will initialize the arraylist of the Observers
    public WeatherData() {
        observers=new ArrayList<>();
    }

    //used to add new observers
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //used to remove old observers
    @Override
    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);
        if(i>=0)
        {
            observers.remove(i);
        }
    }

    public void observersNumber()
    {
        System.out.println(observers.size());
    }
    //will be used to update all the observers in the arraylist observer
    //when creating new data , the setMeasurement after creating new data call the Measurement changed method
    //that will call the notify observer method that will call all the observer lists and update value for each one
    //the observer here is CurrentCondition object of class that implement interface observer
    @Override
    public void notifyObservers() {
        for (Observer observer:observers)
        {
            //observer object here is the currentCondition object implements the observer
            observer.update(temperature,humidity,pressure);
        }
    }
    //here it will be used to call the notify Observers method as to notify observers when there is a new change
    public void measurementsChanged()
    {
        notifyObservers();
    }
    //will be used when we set new data to temperature , pressure and humidity and then will call measurement changed method
    //to update all the observers with new data
    public void setMeasurements(float temperature,float humidity,float pressure)
    {
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        measurementsChanged();
    }
}
