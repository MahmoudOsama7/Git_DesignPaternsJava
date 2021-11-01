package com.company;

//the command that is responsible to make the light on and off
public class LightOnCommand implements Command {

    //reference for the Light class as to use it to switch light on and off
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
