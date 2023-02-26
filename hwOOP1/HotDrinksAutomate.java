package hwOOP1;
import java.util.*;

public class HotDrinksAutomate extends VendingAutomate {
    private List<HotDrink> hotDrinks;
    public Scanner scan = new Scanner(System.in);

    public  HotDrinksAutomate() {
        this.hotDrinks = new ArrayList<>();
    }

    public void addHotDrinks(HotDrink hotDrink) {
        hotDrinks.add(hotDrink);
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }


    @Override
    public void productDelivery() {
        System.out.print("Автомат выдал горячий напиток:");
    }

    public void giveProduct() {
        Map<Integer, String> mapNameHotDrink = new HashMap();
        int count = 1;
        System.out.println("Введите соответствующую напитку цифру: ");
        for (HotDrink drinkName : hotDrinks) {
            mapNameHotDrink.put(count,drinkName.getName());
            count++;
        }
        System.out.println(mapNameHotDrink);
        int choiceHotDrink = scan.nextInt();
        for(HotDrink drink: hotDrinks) {
            if(drink.getName().equals(mapNameHotDrink.get(choiceHotDrink))) {
                System.out.println(drink);
            }
        }
    }

}
