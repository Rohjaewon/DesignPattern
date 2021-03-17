package command;

public class SimpleRemoteControl {
  Command slot;

  public void setCommand(Command cmd) {
    this.slot = cmd;
  }

  public void buttonPressed() {
    slot.execute();
  }
}
