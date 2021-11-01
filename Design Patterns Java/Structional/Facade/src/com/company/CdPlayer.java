package com.company;

public class CdPlayer {
    public void on()
    {
        System.out.println("CD is On..");
    }
    public void off()
    {
        System.out.println("CD is OFF..");
    }
    public void eject()
    {
        System.out.println("Ejecting the Cd in the CD Player...");
    }
    public void pause()
    {
        System.out.println("Pausing CD Player..");
    }
    public void play(String song)
    {
        System.out.println("Playing the song "+song+" On The Cd");
    }
    public void stop()
    {
        System.out.println("Stopping The Cd Player...");
    }
}
