package factorypattern;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    Pizza pizza2 = nyStore.orderPizza("clam");
    System.out.println("Tim ordered a " + pizza2.getName() + "\n");
  }
}
