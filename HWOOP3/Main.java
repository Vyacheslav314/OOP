package HWOOP3;


public class Main {
    
    public static void main(String[] args) {
        Capibara sasy = new Capibara(100, true, "Capa", true, false, 10);
        Pingvin pin =  new Pingvin(50, false, "pany", 10, false);
        Animal ani = new Animal(50, false, "type");
        Zoo<Animal> zooPark =  new Zoo<>();

        zooPark.addSAnimal(ani);
        zooPark.addSAnimal(sasy);
        zooPark.addSAnimal(pin);

        AnimalIterator<Animal> a = new AnimalIterator<>(zooPark);

        while (a.hasNext()) {
            System.out.println(a.next());
            System.out.println("-----------");
        }
    }
}
