package command;

public class RemoteControlTest {
  public static void main(String[] args) {
    // invoker
    RemoteControl remote = new RemoteControl();
    // receiver
    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");
    GarageDoor garageDoor = new GarageDoor();
    Stereo stereo = new Stereo("Living Room");
    // command instance
    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
    LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

    GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
    GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);
    StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

    remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    remote.setCommand(1, kitchenLightOn, kitchenLightOff);
    remote.setCommand(2, garageDoorOpen, garageDoorClose);
    remote.setCommand(3, stereoOnWithCDCommand, stereoOnWithCDCommand);

    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);
    remote.undoButtonWasPushed();
    remote.onButtonWasPushed(1);
    remote.offButtonWasPushed(1);
    remote.onButtonWasPushed(2);
    remote.offButtonWasPushed(2);
    remote.onButtonWasPushed(3);
    remote.offButtonWasPushed(3);
    remote.undoButtonWasPushed();
  }
}
