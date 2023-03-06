package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client data");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = scanner.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Date birthDateLocal = Date.valueOf(LocalDate.parse(birthDate, dateTimeFormatter));
        Client client = new Client(name, email, birthDateLocal);
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(scanner.nextLine());

        Order order = new Order(orderStatus, client);

        System.out.print("How many items to this order? ");
        int itemsOrderQuantity = scanner.nextInt();

        for (int i = 0; i < itemsOrderQuantity; i++) {
            System.out.printf("Enter #%d item data\n", i + 1);
            scanner.nextLine();
            System.out.print("Product name: ");
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            order.addItem(new OrderItem(quantity, productPrice, new Product(productName, productPrice)));
        }

        System.out.println("ORDER SUMMARY");
        System.out.printf("Order moment %s\n", order.getMoment());
        System.out.printf("Order status %s\n", order.getOrderStatus());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("Client: %s (%s) - %s \n",
                order.getClient().getName(),
                simpleDateFormat.format(order.getClient().getBithDate()),
                order.getClient().getEmail()
        );
        System.out.println("Order items:");
        for (OrderItem orderItem : order.getOrderItemList()
        ) {
            System.out.printf("%s, $%.2f, Quantity %d, $%.2f\n",
                    orderItem.getProduct().getName(),
                    orderItem.getPrice(),
                    orderItem.getQuantity(),
                    orderItem.subTotal()
            );
        }
        System.out.printf("Total price $%.2f", order.total());
        scanner.close();

    }
}
