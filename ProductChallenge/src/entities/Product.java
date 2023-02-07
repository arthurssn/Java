 package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return this.quantity * this.price;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public  String toString(){
        return String.format("Product data: %s, $ %.2f, %d units, Total: $ %.2f", this.name, this.price, this.quantity, this.totalValueInStock());
    }
}