package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: \n");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        Product product = new Product(name, price);

        double totalValueInStock = product.totalValueInStock();

        System.out.println("Name of product: " + product.name);

        System.out.println("Price per product: " + product.price);

        System.out.println("Total value in stock: " + totalValueInStock);

        System.out.println("Quantity in stock: " + product.quantity);

        product.addProducts(10);

        product.removeProducts(2);

        System.out.println("Quantity in stock: " + product.quantity);

        System.out.println("Product: " + product);

    }
}
