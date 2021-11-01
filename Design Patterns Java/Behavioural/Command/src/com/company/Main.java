package com.company;

public class Main {

    public static void main(String[] args) {
    	//creating remote control object
		RemoteControl remoteControl= new RemoteControl();

		//creating object for devices
		Light livingRoomLight= new Light("Living Room Light");
		Light kitchenRoomLight=new Light("Kitchen Room Light");
		Stereo stereo= new Stereo();

		//creating the buttons status either on or off for the devices
		LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);

		//creating the buttons status either on or off for the devices
		LightOnCommand kitchenRoomLightOn= new LightOnCommand(kitchenRoomLight);
		LightOffCommand kitchenRoomLightOff= new LightOffCommand(kitchenRoomLight);

		//creating the buttons status either on or off for the devices
		StereoOnWithCDCommand stereoOnWithCDCommand=new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand= new StereoOffCommand(stereo);

		//saving the slots either to be on or off
		remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
		remoteControl.setCommand(1,kitchenRoomLightOn,kitchenRoomLightOff);
		remoteControl.setCommand(2,stereoOnWithCDCommand,stereoOffCommand);



		//clicking on button of slot = 0
		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPushed(0);
		//undo what happened just before this step
		remoteControl.undoButtonWasPressed();

		//clicking on button of slot = 1
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPushed(1);
		//undo what happened just before this step
		remoteControl.undoButtonWasPressed();

		//clicking on button of slot = 2
		remoteControl.onButtonWasPressed(2);
		remoteControl.offButtonWasPushed(2);
		//undo what happened just before this step
		remoteControl.undoButtonWasPressed();


    }
}
