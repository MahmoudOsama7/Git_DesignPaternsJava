package com.company;

//the interface has only one method just to update the data at any change
public interface Observer {
    void update (float temperature,float humidity,float pressure);
}
