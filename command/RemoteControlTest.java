package command;

public class RemoteControlTest {
  public static void main(String[] args) {
    // invoker
    SimpleRemoteControl remote = new SimpleRemoteControl();
    // receiver
    Light light = new LivingRoomLight();
    // command instance
    LightOnCommand lightOn = new LightOnCommand(light);

    remote.setCommand(lightOn);
    remote.buttonPressed();
  }
}
