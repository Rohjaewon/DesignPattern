package factorypattern;

public class ChicagoStyleCheesePizza extends Pizza {
  public ChicagoStyleCheesePizza() {
    name = "Chicago Style Deep Dish Cheese Pizza";
    dough = "Extra Thick Crst Dough";
    sauce = "Plum Tomato Sauce";

    toppings.add("Shrhedded Mozzarella Cheese");
  }

  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }
}
