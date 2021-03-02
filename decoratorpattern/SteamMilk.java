package decoratorpattern;

public class SteamMilk extends CondimentDecorator {
  Beverage beverage;

  public SteamMilk(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return this.beverage.getDescription() + ", 스팀 우유";
  }

  public double cost() {
    return this.beverage.cost() + .50;
  }
}
