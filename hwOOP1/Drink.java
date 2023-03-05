package hwOOP1;



public abstract class Drink {

    public String name;
    public double volume;


    public Drink(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public abstract String getName();

    public abstract double getVolume();

    public abstract void setName(String name);

    public abstract void setVolume(int volume);

}