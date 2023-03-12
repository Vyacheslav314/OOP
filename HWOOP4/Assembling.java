package HWOOP4;

import java.util.Map;

public class Assembling {
    
    public void assembling() {
        Product donat = new Product("Еда", "Пончик", 70);
        Product chocolateBar = new Product("Еда", "Mars", 70);
        DrinkProduct colla = new DrinkProduct("Напиток", "Colla", 100, 0.5);
        DrinkProduct fanta = new DrinkProduct("Напиток", "Fanta", 100, 0.5);
        HotDrinkProduct coffe = new HotDrinkProduct("Горячий напиток", "Кофе", 80, 0.3, 80);
        HotDrinkProduct tea = new HotDrinkProduct("Горячий напиток", "Чай", 60, 0.3, 85);

        AssortmentIterator<Product> iter = new AssortmentIterator<>();
        iter.addProduct(donat);
        iter.addProduct(chocolateBar);
        iter.addProduct(colla);
        iter.addProduct(fanta);
        iter.addProduct(coffe);
        iter.addProduct(tea);

        VendingAutomateBehavior<Product> automate = new VendingAutomateBehavior<>(iter); 
        automate.showAssortment(iter);
        int com = automate.searchTypeProduct(iter);
        Map<Integer, Product> map = automate.mapProduct(iter, com);
        com = automate.searchProduct(map);
        automate.payment(map, com);
    }
}
