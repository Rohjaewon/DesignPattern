package decoratorpattern;

public class Mocha extends CondimentDecorator {
  Beverage beverage;

  public Mocha(Beverage bv) {
    this.beverage = bv;
  }

  public String getDescription() {
    return this.beverage.getDescription() + ", 모카";
  }

  public double cost() {
    return this.beverage.cost() + .20;
  }
}
