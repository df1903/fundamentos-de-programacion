/** 5) Simple store inventory with an ArrayList of products. */

// imports
import java.util.ArrayList;

public class Inventory {

    static class Product {
        String name;
        int quantity;
        double price;

        Product(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
    }

    private ArrayList<Product> products = new ArrayList<>();

    public void add(String name, int quantity, double price) {
        products.add(new Product(name, quantity, price));
    }

    public double totalValue() {
        double total = 0;
        for (Product p : products) {
            total += p.quantity * p.price;
        }
        return total;
    }

    public void show() {
        for (Product p : products) {
            System.out.println(p.name + " - " + p.quantity + " units - $" + p.price);
        }
        System.out.println("Total value: $" + totalValue());
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.add("Notebook", 40, 3500);
        inventory.add("Pen", 120, 1200);
        inventory.add("Backpack", 15, 45000);
        inventory.show();
    }
}
