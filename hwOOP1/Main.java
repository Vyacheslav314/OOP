package hwOOP1;

import java.util.ArrayList;
import java.util.Collections;


// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать 
// перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

public class Main {
    
    
    public static void main(String[] args) {
        HotDrink coffe = new  HotDrink("Кофе", 0.3, 70);
        HotDrink tea = new  HotDrink("Чай", 0.4, 70);
        HotDrink capuchino = new  HotDrink("Капучино", 0.5, 80);
        HotDrink limonad = new HotDrink("Буратино", 0.5);
        HotDrink cola = new HotDrink("Coco Colla", 1);
        VendingAutomate automate = new VendingAutomate(); // почему не работает comparator?
        automate.addHotDrink(capuchino);
        automate.addHotDrink(coffe);
        automate.addHotDrink(tea);
        automate.addHotDrink(limonad);
        automate.addHotDrink(cola);
        ArrayList<HotDrink> hd = new ArrayList<>();  // новый массив для comparator
        HotDrinksVendingMachine hotDrinkAutomate = new HotDrinksVendingMachine(automate);
        while (hotDrinkAutomate.hasNext()) {
            hd.add(hotDrinkAutomate.next());    // Итерация
        }

        System.out.println(hd);
        System.out.println("------------");
        Collections.sort(hd, new VolumeComparator());   // Comparetor по объёму
        System.out.println(hd);
        
    }
}
