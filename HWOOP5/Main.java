package HWOOP5;

public class Main {
    
    public static void main(String[] args) {
        SimpleCoffeeFactory coffeeFactory = new SimpleCoffeeFactory();
        CoffeShope shope = new CoffeShope(coffeeFactory);
        shope.orderCoffee(CoffeType.AMERICANO);
        shope.orderCoffee(CoffeType.CAFFE_LATTE);
        shope.orderCoffee(CoffeType.CAPPUCCINO);
    }
}
