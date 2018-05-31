package main.java.mytaxi.app.model;

import main.java.mytaxi.app.types.StatusType;

import java.time.LocalDateTime;

public class Order {

    private static long id;
    private Client client;
    private Address from;
    private Address to;
    private Driver driver;
    private int price;
    private StatusType statusType;
    private LocalDateTime orderDateTime;

    public Order() {
    }

    public Order(Client client, Address from, Address to, Driver driver, int price, StatusType statusType) {
        this.client = client;
        this.from = from;
        this.to = to;
        this.driver = driver;
        this.price = price;
        this.statusType = statusType;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Order.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Address getFrom() {
        return from;
    }

    public void setFrom(Address from) {
        this.from = from;
    }

    public Address getTo() {
        return to;
    }

    public void setTo(Address to) {
        this.to = to;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public StatusType getStatus() {
        return statusType;
    }

    public void setStatus(StatusType status) {
        this.statusType = status;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }
}
