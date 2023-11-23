package Behavioral.ChainOfResponsibility.Interface;

import Behavioral.ChainOfResponsibility.Orders.Order;

public interface OrdersInterface {
    void processTheOrder(Order order);
}
