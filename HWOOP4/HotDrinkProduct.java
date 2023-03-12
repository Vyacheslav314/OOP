package HWOOP4;

public class HotDrinkProduct extends Product {

    private double volume;
    private int temperature;
    
    public HotDrinkProduct(String type, String name, int price, double volume, int temperature) {
        super(type, name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nОбъем: %f\nТемпература: %d", volume, temperature);
    }
   
}
