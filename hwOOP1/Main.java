package hwOOP1;

// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать 
// перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

public class Main {
    
    public static void main(String[] args) {
        HotDrink coffe = new  HotDrink("coffe", 0.3, 70);
        HotDrink tea = new  HotDrink("tea", 0.4, 70);
        HotDrink capuchino = new  HotDrink("capuchino", 0.5, 80);
        HotDrinksAutomate hotDrVenMach = new HotDrinksAutomate();
        hotDrVenMach.addHotDrinks(coffe);
        hotDrVenMach.addHotDrinks(capuchino);
        hotDrVenMach.addHotDrinks(tea);

        System.out.println(hotDrVenMach.getHotDrinks());
              
        hotDrVenMach.giveProduct();
    }
}
