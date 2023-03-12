package HWOOP3;

public class Animal {

    protected int weight;
    protected boolean mammal;
    protected String name;

    public Animal(int weight, boolean mammal, String name) {
        this.weight = weight;
        this.mammal = mammal;
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format("Вес: %d\nМлеко: %b\nКличка: %s", weight, mammal, name);
    }

}
