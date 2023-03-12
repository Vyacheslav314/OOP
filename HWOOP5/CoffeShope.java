package HWOOP5;

public class CoffeShope {

    private SimpleCoffeeFactory coffeeFactory;


    public CoffeShope(SimpleCoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffe orderCoffee(CoffeType type) {
        Coffe coffee = coffeeFactory.createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }
}
