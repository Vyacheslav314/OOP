package HWOOP3;


import java.util.Iterator;
import java.util.List;

public class AnimalIterator<T extends Animal> implements Iterator<T> {

    private int count;
    private List<T> listAnimal;
    
    public AnimalIterator(Zoo<T> animal) {
        this.count = 0;
        this.listAnimal = animal.getAnimalListt();
    } 


    @Override
    public boolean hasNext() {
        return count < listAnimal.size();
    }

    @Override
    public T next() {
        return (T) listAnimal.get(count++);
    }
    
}
