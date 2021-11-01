package com.company;

public class DVDPlayer {
    public void on()
    {
        System.out.println("DVD is On..");
    }
    public void off()
    {
        System.out.println("DVD is OFF..");
    }
    public void eject()
    {
        System.out.println("Ejecting the DVD in the DVD Player...");
    }
    public void pause()
    {
        System.out.println("Pausing DVD Player..");
    }
    public void play(String movie)
    {
        System.out.println("Playing the Movie "+movie+" On The Dvd Player");
    }
    public void stop()
    {
        System.out.println("Stopping The DVD Player...");
    }
    public void setSurroundAudio()
    {
        System.out.println("Setting The Surrounding Audio On...");
    }
    public void setTwoChannelAudio()
    {
        System.out.println("Setting The Two Channel Audio On...");
    }
}
