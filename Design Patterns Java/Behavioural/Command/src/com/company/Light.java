package com.company;

public class Light {

    String light;
    public Light(String light)
    {
        this.light=light;
    }
    public void on()
    {
        System.out.println(this.light+": On");
    }
    public void off()
    {
        System.out.println(this.light+": Off");
    }
}
