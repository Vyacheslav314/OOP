package hwOOP1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VendingAutomate implements Iterable<HotDrink>{
    
    private ArrayList<HotDrink> drinks = new ArrayList<>();

    public void addHotDrink(HotDrink hotDrink) {
        this.drinks.add(hotDrink);
    }

    public List<HotDrink> getHotDrinks() {
        return drinks;
    }

    public void setHotDrinks(ArrayList<HotDrink> hotDrinks) {
        this.drinks = hotDrinks;
    }


    @Override
    public Iterator<HotDrink> iterator() {
        return new HotDrinksVendingMachine(this);
    }
    
}
