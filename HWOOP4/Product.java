package HWOOP4;

public class Product {
    
    protected String type;
    protected String name;
    protected int price;

    public Product(String type, String name, int price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Категория: %s\nНазвание: %s\nЦена: %d", type, name, price);
    }
}
