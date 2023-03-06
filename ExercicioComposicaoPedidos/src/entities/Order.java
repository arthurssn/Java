package entities;

import entities.enums.OrderStatus;

import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Order {
    private Date moment;
    private OrderStatus orderStatus;
    private Client client;
    private List<OrderItem> orderItemList = new CopyOnWriteArrayList<>();

    public Order(OrderStatus orderStatus, Client client) {
        this.moment = new Date();
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        this.orderItemList.add(item);
    }

    public void removeItem(OrderItem item) {
        this.orderItemList.remove(item);
    }

    public Double total() {
        return this.orderItemList.stream().mapToDouble(OrderItem::subTotal).sum();
    }

    public Client getClient() {
        return client;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }
}
