package com.company;

//current Condition for Temperature and Pressure only!
public class CurrentCondition implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private final Subject subject; //weatherData Class implements Subject

    //here as to state that the type of Subject interface object created is weatherData class object
    //as the weatherData implements the subject

    public CurrentCondition(Subject subject) {
        this.subject=subject;
    }

    //to remove the weatherData object from the subscribers to the data change
    //or i can say this
    //currentCondition.subscribe();  then subject.removeObserver(this);
    //and in the method subscribe itself in currentCondition class i don't need to pass
    //because internally i'm passing this which state passing the current object
    //so passing this as object is the same as passing the current object created in the main , both are teh same
    //can do the same for un subscribe
    public void unSubscribe()
    {
        subject.removeObserver(this);
    }
    public void subscribe(CurrentCondition currentCondition)
    {
        subject.registerObserver(currentCondition);//this here means current object of teh interface
        //and the actual type of the object being passed is observer , however we don't pass interface we pass the
        //object implementing that is currentCondition class object
    }
    @Override
    public void display() {
        System.out.println("Current Condition: "+ temperature +"F degrees and "+ humidity +"% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
}
