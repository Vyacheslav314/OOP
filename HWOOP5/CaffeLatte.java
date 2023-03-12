package HWOOP5;

public class CaffeLatte implements Coffe {
    
    @Override
    public void grindCoffee() {
        System.out.println("Ваш заказ принят. Перемалываем кофе ");
    }
    
    @Override
    public void makeCoffee() {
        System.out.println("Ваш Latte готовят ");
    }

    @Override
    public void pourIntoCup() {
        System.out.println("Наливаем в чашку ");
    }
}
