package hwOOP1;

import java.util.Objects;

public class HotDrink extends Drink {
    
    private int temperature;

    public HotDrink(String name, double volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public HotDrink(String name, double volume) {
        super(name, volume);
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String getName() {
        return super.name;
    }
    @Override
    public double getVolume() {
        return super.volume;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void setVolume(int volume) {
        super.volume = volume;
    }

    @Override
    public String toString() {
        return "\n\ndrink = " + getName() + "\nvolume = " + getVolume() + "\ntemperature = " + getTemperature();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        HotDrink drink = (HotDrink) obj;
        return Double.compare(drink.volume, volume) == 0 && Objects.equals(name, drink.name) && Objects.equals(drink.temperature, temperature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, volume);
    }

    // @Override
    // public int compareTo(HotDrink hotDrink) {
    //     if (hotDrink.volume == this.volume) {
    //         return 0;
    //     } else if (hotDrink.volume < this.volume) {
    //         return -1;
    //     } else {
    //         return 1;
    //     }

    // }

}
