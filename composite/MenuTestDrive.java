package composite;

public class MenuTestDrive {
  public static void main(String[] args) {
    MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "저녁 메뉴");
    MenuComponent cafeMenu = new Menu("객체마을 카페 메뉴", "카페 메뉴");
    MenuComponent dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨 보세요!");

    MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");
    allMenus.add(dinerMenu);
    allMenus.add(cafeMenu);

    dinerMenu.add(new MenuItem("파스타", "마리나라 소스 스파게티.", true, 3.89));
    dinerMenu.add(dessertMenu);
    dessertMenu.add(new MenuItem("애플파이", "바삭바삭한 크로스트에 바닐라 아이스크림 얹혀 있는 애플파이", true, 1.59));

    Waitress waitress = new Waitress(allMenus);
    // waitress.printMenu();
    waitress.printVegetarianMenu();
  }
}
