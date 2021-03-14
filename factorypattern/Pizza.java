package factorypattern;

import java.util.ArrayList;

public abstract class Pizza {
  String name;
  Dough dough;
  Sauce sauce;
  Veggies[] veggies;
  Cheese cheese;
  Pepperoni pepperoni;
  Clams clam;

  abstract void prepare();

  ArrayList<String> toppings = new ArrayList<String>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  public String toString() {
    StringBuffer display = new StringBuffer();
    display.append("---- " + name + " ----");
    display.append(dough.toString() + "\n");
    display.append(sauce.toString() + "\n");
    for (String topping : toppings) {
      display.append(topping + "\n");
    }
    return display.toString();
  }
}
