package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.print("What is the number of products? ");
        Scanner scanner = new Scanner(System.in);
        int numberOfProducts = scanner.nextInt();
        Product[] products = new Product[numberOfProducts];
        for (int i = 0; i < numberOfProducts; i++) {
            scanner.nextLine();
            System.out.printf("Product name %d: ", i + 1);
            String productName = scanner.nextLine();
            System.out.printf("Product price %d: ", i + 1);
            double productPrice = scanner.nextDouble();
            products[i] = new Product(productName, productPrice);
        }
        double sum = 0.0;
        for (Product product : products) {
            sum += product.getPrice();
            System.out.printf("Name: %s, Price: $ %.2f\n", product.getName(), product.getPrice());
        }
        double avg = sum / products.length;
        System.out.printf("AVERAGE PRICE = %.2f\n", avg);
    }
}
