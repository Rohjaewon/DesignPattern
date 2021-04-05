package iterator;

public class MenuTestDrive {
  public static void main(String[] args) {
    Menu dinerMenu = new DinerMenu();
    Menu cafeMenu = new CafeMenu();

    Waitress waitress = new Waitress(dinerMenu, cafeMenu);
    waitress.printMenu();
  }
}
