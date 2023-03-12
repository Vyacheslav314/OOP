package HWOOP5;

public class Cappuccino implements Coffe {
    
    @Override
    public void grindCoffee() {
        System.out.println("Ваш заказ принят. Перемалываем кофе ");
    }
    
    @Override
    public void makeCoffee() {
        System.out.println("Ваш Cappuccino готовят ");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаем в чашку ");
    }
}
