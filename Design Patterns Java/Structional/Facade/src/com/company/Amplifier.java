package com.company;

public class Amplifier {
    public  void on ()
    {
        System.out.println("Amplifier On..");
    }
    public void off ()
    {
        System.out.println("Amplifier Off...");
    }
    public void setTuner()
    {
        System.out.println("Setting Tuner On...");
    }
    public void setSurroundSound()
    {
        System.out.println("Setting Surround Sound..");
    }
    public void setStereoSound()
    {
        System.out.println("Setting Stereo Sound On...");
    }
    public void setVolume(int volume)
    {
        System.out.println("Setting The Volume to "+volume);
    }
    public void setDvd (int dvd)
    {
        System.out.println("Setting Dvd Number "+dvd+" On..");
    }
    public void setCD (int dvd)
    {
        System.out.println("Setting CD Number "+dvd+" On..");
    }
}

