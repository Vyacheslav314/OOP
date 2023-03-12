package HWOOP5;

public class SimpleCoffeeFactory {

    public Coffe createCoffee (CoffeType type) {
        Coffe coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new CaffeLatte();
                break;
            default:
                break;
        }

        return coffee;
    }
}
