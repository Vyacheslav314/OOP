package HWOOP4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AssortmentIterator<T extends Product> implements Iterable<T>{
    
    private List<T> assortmentList = new ArrayList<>();

    public void addProduct(T animal) {
        this.assortmentList.add(animal);
    }

    public List<T> getAssortment() {
        return assortmentList;
    }


    @Override
    public Iterator<T> iterator() {
        return new VendingAutomate<T>(this);
    }
    
}
