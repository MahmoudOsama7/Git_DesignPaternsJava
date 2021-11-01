package com.company;

public class Tuner {
    public void on()
    {
        System.out.println("Tuner is On..");
    }
    public void off()
    {
        System.out.println("Tuner is OFF..");
    }
    public void setAm()
    {
        System.out.println("Tuner Now Is On AM Mode..");
    }
    public void setFm()
    {
        System.out.println("Tuner Now Is On FM Mode..");
    }
    public void setFrequency(double frequency)
    {
        System.out.println("The Frequency Now Is "+ frequency);
    }
}
