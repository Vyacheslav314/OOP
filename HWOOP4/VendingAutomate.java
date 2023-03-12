package HWOOP4;

import java.util.Iterator;
import java.util.List;

public class VendingAutomate<T extends Product> implements Iterator<T> {

    protected int index = 0;
    protected List<T> assortment;

    public VendingAutomate(AssortmentIterator<T> assortment) {
        this.assortment = assortment.getAssortment();
    }

    @Override
    public boolean hasNext() {
        if(index < assortment.size()) {
            return true;
        }
        return false;
    }

    @Override
    public T next() { 
       return assortment.get(index++);  
    }
    
}
