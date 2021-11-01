package com.company;

public class RemoteControl {
    Command[] onCommand; //array holding data of type interface Command and handle the onCommand
    Command[] offCommand; //array holding data of type interface Command and handle the offCommand
    Command undoCommand; //describe the undo command that means getting back in the command and can put only one undo Command

    public RemoteControl()
    {
        //initializing the array of type Command and stating the array of type interface size
        onCommand=new Command[7];
        offCommand=new Command[7];

        Command noCommand=new NoCommand();
        for(int i=0;i<7;i++)
        {
            //equalizing them to be equal no commands so now they are equal to no command so they do nothing
            //will be equalizing to do something later
            onCommand[i]=noCommand;
            offCommand[i]=noCommand;
        }
        undoCommand=noCommand;
    }
    public void setCommand(int slot,Command onCommand,Command offCommand)
    {
        //setting the on and off command in the array of command
        //to put the switching on in the list of onCommand
        //to put the switching off in the list of offCommand
        this.onCommand[slot]=onCommand;
        this.offCommand[slot]=offCommand;
    }
    public void onButtonWasPressed(int slot)
    {
        //click on button to execute it to be turned on like turn LightOn
        //store this command by getting it from the list by the slot in the undo as if i want to undo it
        onCommand[slot].execute();
        undoCommand=onCommand[slot];
    }
    public void offButtonWasPushed(int slot)
    {
        //click on button to execute it to be turned off like turn LightOn
        //store this command by getting it from the list by the slot in the undo as if i want to undo it
        offCommand[slot].execute();
        undoCommand=offCommand[slot];
    }
    public void undoButtonWasPressed()
    {
        undoCommand.undo();
    }

}
