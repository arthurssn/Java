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


        System.out.println(product);


        product.addProducts(10);
        product.removeProducts(2);

        System.out.println("Update product data:");

        scanner.nextLine();
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Price: ");
        price = scanner.nextDouble();
        scanner.close();

        product.setName(name);
        product.setPrice(price);

        System.out.println("Quantity in stock: " + product.getQuantity());
        System.out.println("Product: " + product);

    }
}
