package hwOOP1;




public class HotDrink extends Drink{
    
    private int temperature;

    public HotDrink(String name, double volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "\n\ndrink = " + super.getName() + "\nvolume = " + super.getVolume() + "\ntemperature = " + temperature;
    }

}
