package factorypattern;

import java.util.ArrayList;

public abstract class Pizza {
  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList<String>();

  public String getName() {
    return name;
  }

  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough...");
    System.out.println("Adding sauce...");
    System.out.println("Adding toppings");
    for (int i = 0; i < toppings.size(); i++) {
      System.out.println("    " + toppings.get(i));
    }
  }

  public void bake() {
    System.out.println("Baking " + name);
  }

  public void cut() {
    System.out.println("Cutting " + name);
  }

  public void box() {
    System.out.println("Boxing " + name);
  }

  public String toString() {
    StringBuffer display = new StringBuffer();
    display.append("---- " + name + " ----");
    display.append(dough + "\n");
    display.append(sauce + "\n");
    for (String topping : toppings) {
      display.append(topping + "\n");
    }
    return display.toString();
  }
}
