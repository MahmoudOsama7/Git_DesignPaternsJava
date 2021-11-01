package com.company;

public class Main {

    public static void main(String[] args) {

        //i have created the class type and for now i need to create type of class i want to use as amplifier , cd and so on
        //as for the Home Theatre to know exactly which home theatre it will operate on and on
        HomeTheatre homeTheatre=new HomeTheatre(new Amplifier(),new CdPlayer(),new DVDPlayer(),new Popper(),new Projector(),
        new Screen(),new TheatreLights(),new Tuner());
        homeTheatre.watchMovie("The Prestige");
        homeTheatre.endMovie();
    }
}
