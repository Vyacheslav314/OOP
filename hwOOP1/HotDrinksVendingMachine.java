package hwOOP1;

import java.util.Iterator;
import java.util.List;

public class HotDrinksVendingMachine  implements Iterator<HotDrink> {
    
    private int count;
    private final List<HotDrink> hotDrinksList;

    public HotDrinksVendingMachine(VendingAutomate vAutomate) {
        this.count = 0;
        this.hotDrinksList = vAutomate.getHotDrinks();
    }


    @Override
    public boolean hasNext() {
        return count <= hotDrinksList.size() - 1;
    }

    @Override
    public HotDrink next() {
        return hotDrinksList.get(count++);
    }
}
