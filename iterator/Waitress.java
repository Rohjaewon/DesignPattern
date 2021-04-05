package iterator;

import java.util.Iterator;

public class Waitress {
  Menu dinerMenu;
  Menu cafeMenu;

  public Waitress(Menu dinerMenu, Menu cafeMenu) {
    this.dinerMenu = dinerMenu;
    this.cafeMenu = cafeMenu;
  }

  public void printMenu() {
    Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
    Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
    System.out.println("메뉴\n----\n아침메뉴");
    printMenu(dinerIterator);
    System.out.println("\n저녁메뉴");
    printMenu(cafeIterator);
  }

  private void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      System.out.println(menuItem.getName() + ", ");
      System.out.println(menuItem.getPrice() + " --");
      System.out.println(menuItem.getDescription());
    }
  }
}
