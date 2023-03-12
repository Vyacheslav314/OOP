package HWOOP3;

public class Pingvin extends Animal {
    
    private int beakLength;
    private boolean flies;


    public Pingvin(int weight, boolean mammal, String name, int beakLength, boolean flies) {
        super(weight, mammal, name);
        this.beakLength = beakLength;
        this.flies = flies;
    }

    @Override
    public String toString() {
        return String.format("Вес: %d\nМлеко: %b\nКличка: %s\nbeak: %d\nfly: %b", weight, mammal, name, beakLength, flies);
    }
}
