package observerpattern.util;

import java.util.Observable;
import java.util.Observer;

@Deprecated
public class CurrentConditionsDisplay implements Observer, Display {
  Observable observable;
  private float temperature;
  private float humidity;

  public CurrentConditionsDisplay(Observable obs) {
    this.observable = obs;
    obs.addObserver(this);
  }

  public void update(Observable obs, Object args) {
    if (obs instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) obs;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }

  public void display() {
    System.out.println(
        "Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }
}
