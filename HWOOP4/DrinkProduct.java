package HWOOP4;

public class DrinkProduct extends Product {
    
    private double volume;

    public DrinkProduct(String type, String name, int price, double volume) {
        super(type, name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nОбъем: %f", volume);
    }
}
