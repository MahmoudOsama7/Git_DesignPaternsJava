package com.company;

public class HomeTheatre {
    //Creating Reference for any class as to use it by HomeTheatre object only!!
    Amplifier amplifier;
    CdPlayer cdPlayer;
    DVDPlayer dvdPlayer;
    Popper popper;
    Projector projector;
    Screen screen;
    TheatreLights theatreLights;
    Tuner tuner;

    public HomeTheatre(Amplifier amplifier, CdPlayer cdPlayer, DVDPlayer dvdPlayer, Popper popper,
                       Projector projector, Screen screen, TheatreLights theatreLights, Tuner tuner)
    {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
        this.theatreLights = theatreLights;
        this.tuner = tuner;
    }
    public void watchMovie(String movie)
    {
        System.out.println("Get Ready To Watch "+ movie);
        popper.on();
        popper.pop();
        theatreLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(1);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }
    public void endMovie()
    {
        System.out.println("Ending Movie And Theatre System Is Shutting Down");
        popper.off();
        theatreLights.off();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
