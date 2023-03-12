package HWOOP3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zoo<T extends Animal> implements Iterable<T>{


    private List<T> zooPark = new ArrayList<>();

    public void addSAnimal(T animal) {
        this.zooPark.add(animal);
    }

    public List<T> getAnimalListt() {
        return zooPark;
    }

    public void setAnimalList(List<T> aList) {
        this.zooPark = aList;
    }


    @Override
    public Iterator<T> iterator() {
        return new AnimalIterator<T>(this);
    }

}
