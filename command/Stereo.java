package command;

public class Stereo {
  String name;
  int volume;

  public Stereo(String name) {
    this.name = name;
  }

  public void on() {
    System.out.println(name + " stereo on!");
  }

  public void off() {
    System.out.println(name + " stereo off!");
  }

  public void setCD() {
    System.out.println(name + " stereo set cd");
  }

  public void setDvd() {
    System.out.println(name + " stereo set dvd");
  }

  public void setRadio() {
    System.out.println(name + " stereo set radio");
  }

  public void setVolume(int vol) {
    this.volume = vol;
    System.out.println(name + " stereo volume is " + Integer.toString(volume));
  }
}
