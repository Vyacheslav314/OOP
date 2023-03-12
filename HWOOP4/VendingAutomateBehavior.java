package HWOOP4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingAutomateBehavior<T> extends AssortmentIterator<Product> {
    
    public Scanner scan = new Scanner(System.in);

    public VendingAutomateBehavior(AssortmentIterator<Product> assortment) {
        assortment.getAssortment();
    }
    
    public void showAssortment (AssortmentIterator<Product> assortment) {
        VendingAutomate<Product> assortmentList = new VendingAutomate<>(assortment);
        while (assortmentList.hasNext()) {
            System.out.println(assortmentList.next());
            System.out.println("----------------------");
        }
    }
    
    public int searchTypeProduct(AssortmentIterator<Product> assortment) {
        VendingAutomate<Product> assortmentList = new VendingAutomate<>(assortment);
        Map<Integer, String> map = new HashMap<>();
        int count = 1;
        System.out.println("Выберите категорию продуктов из перечисленных");
        while (assortmentList.hasNext()) {
            String str = assortmentList.next().getType();
            if(map.isEmpty()){
                map.put(count, str);
                count++;
            }else if(!map.containsValue(str)) {
                map.put(count, str);
                count++;
            }
        }
        System.out.println(map);
        return input();
    }

    public Map<Integer, Product> mapProduct(AssortmentIterator<Product> assortment, int command) {
        VendingAutomate<Product> assortmentList = new VendingAutomate<>(assortment);
        Map<Integer, Product> map = new HashMap<>();
        int count = 1;
        while (assortmentList.hasNext()) {
            Product product = assortmentList.next();
            if(command == 1) {
                if (product.getType().equals("Еда")) {
                    map.put(count, product);
                    count++;
                }
            }else if(command == 2) {
                if (product.getType().equals("Напиток")) {
                    map.put(count, product);
                    count++;
                }
            }else if(command == 3) {
                if (product.getType().equals("Горячий напиток")) {
                    map.put(count, product);
                    count++;
                }
            }
            
        }
        return map;
    }

    public int searchProduct(Map<Integer, Product> map) {
        System.out.println("Выберите продукт из перечисленных");
        for(Map.Entry<Integer, Product> pair : map.entrySet()) {
            System.out.println("Номер продукта " + pair.getKey());
            System.out.println(pair.getValue());
        }
        return input();    
    }

    public void payment(Map<Integer, Product> map, int command) {
        System.out.println("Внесите деньги ");
        Product product = map.get(command);
        System.out.println("Цена " + product.getPrice());
        int money = input();
        if(money == product.getPrice()) {
            System.out.println("Заберите ваш заказ в окне выдачи ");
        }else if(money > product.getPrice()) {
            int res = product.getPrice() - money;
            System.out.println("Ваша сдача " + res);
            System.out.println("Заберите ваш заказ в окне выдачи ");
        }else {
            System.out.println("Вы ввели недостачно средств.");
            payment(map, command);
        }
    }

    public void takeOrder() {
        System.out.println("Ваш заказ принят ");
    }

    public int input() {
        return scan.nextInt();
    }

}
