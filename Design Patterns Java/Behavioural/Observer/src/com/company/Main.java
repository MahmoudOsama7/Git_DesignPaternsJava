package com.company;


/*
we create three interfaces
1-which state the type of the object that will listen like WeatherData object but will create first interface called Subject
then the class weatherData will implement it's methods
2-will create interface observer that only has one method which will be called to update new values
3-will create interface DisplayElement that will display result to the Main user
4-we create class like Current Condition , Current Statistics as to implement the interfaces Observer and Display Element
//as to update the new Data and display it to the user

 */
public class Main {

    public static void main(String[] args) {
		//here new weatherData object is created and is the one responsible for the data change

	    WeatherData weatherData=new WeatherData();


		//here the observers CurrentConditions are created and meaning of passing weather data as object
		//that the observers now will observe to the data change of object weatherData
	    CurrentCondition currentCondition=new CurrentCondition(weatherData);//here new Current Condition Object created
		CurrentCondition currentCondition1= new CurrentCondition(weatherData);
		CurrentCondition currentCondition2= new CurrentCondition(weatherData);

		//get observers numbers
		weatherData.observersNumber();

		//that the observers now will observe to the data change of object weatherData
		//and the weather now is added to the arrayList of Subscribers
		//when we say subscribe , we make sure that the weatherData has parameter of list of observers to it's data
		//so when we say currentCondition.subscribe we make sure that list of observers is increased by one

		//or i can say this
		//currentCondition.subscribe(); and in the method subscribe itself in currentCondition class i don't need to pass
		//because internally i'm passing this which state passing the current object
		currentCondition.subscribe(currentCondition);
		currentCondition1.subscribe(currentCondition);
		currentCondition2.subscribe(currentCondition);


		//set the new data
	    weatherData.setMeasurements(80,65,30);
		weatherData.observersNumber();
	    //now the weatherData object is removed from the list of subscribers so no longer receiving the new data
	    currentCondition.unSubscribe();
		weatherData.setMeasurements(85,61,70);

		weatherData.observersNumber();
    }
}
