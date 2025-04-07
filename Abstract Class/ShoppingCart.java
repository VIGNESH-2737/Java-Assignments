import java.util.ArrayList;
import java.util.List;

abstract class Product {
    protected String name;

    public Product(String name) {
        this.name = name;
    }

    public abstract double getPrice();
    public abstract String getDescription();
}

class ElectronicsProduct extends Product {
    private double price;
    private String brand;

    public ElectronicsProduct(String name, double price, String brand) {
        super(name);
        this.price = price;
        this.brand = brand;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + name + ", Brand: " + brand + ", Price: " + price;
    }
}

class ClothingProduct extends Product {
    private double price;
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name);
        this.price = price;
        this.size = size;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Clothing: " + name + ", Size: " + size + ", Price: " + price;
    }
}

class BookProduct extends Product {
    private double price;
    private String author;

    public BookProduct(String name, double price, String author) {
        super(name);
        this.price = price;
        this.author = author;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Book: " + name + ", Author: " + author + ", Price: " + price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();

        cart.add(new ElectronicsProduct("Smartphone", 15000.0, "Samsung"));
        cart.add(new ClothingProduct("T-Shirt", 599.0, "M"));
        cart.add(new BookProduct("The Alchemist", 399.0, "Paulo Coelho"));

        double total = 0;

        System.out.println("Shopping Cart Details:\n");

        for (Product product : cart) {
            System.out.println(product.getDescription());
            total += product.getPrice();
        }

        System.out.println("\nTotal Price: " + total);
    }
}
