package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {

        this.name = name;
        this.price = price;
        
    }

    public double totalValueInStock() {
        if (this.quantity == 0) return 0;
        return this.quantity * this.price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return String.format("Product data: %s, $ %.2f, %d units, Total: $ %.2f", this.name, this.price, this.quantity, this.totalValueInStock());
    }
}