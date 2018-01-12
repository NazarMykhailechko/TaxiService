package mytaxi.app.controller;

import mytaxi.app.exceptions.*;
import mytaxi.app.model.Address;
import mytaxi.app.model.Client;
import mytaxi.app.model.Order;

public interface
ClientService {

    String register(String name, String phone, String password) throws ClientCreateException;
    Client login(String phone, String password) throws LoginException, ClientNotFoundException;
    Order makeOrder(Address from, Address to) throws MakeOrderException;
    Order submitOrder(Order order) throws SubmitException;
    Order getOrderInfo(long orderId) throws GetOrderInfoException;
    String cancelOrder(long orderId) throws CancelOrderException;

}
