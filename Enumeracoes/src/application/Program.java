package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order1 = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        Order order2 = new Order(1080, new Date(), OrderStatus.valueOf("PENDING_PAYMENT"));
        System.out.println(order1);
        System.out.println(order2);
    }
}
