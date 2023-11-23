package Behavioral.Command;

import Behavioral.Command.Orders.*;


public class OnlineShop {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        OrderCommand placeOrderCommand = new PlaceOrderCommand(orderService);
        OrderCommand cancelOrderCommand = new CancelOrderCommand(orderService);

        placeOrderCommand.execute();
        System.out.println("Order status: " + orderService.isOrderPlaced() + "\n");

        cancelOrderCommand.execute();
        System.out.println("Order status: " + orderService.isOrderPlaced());
    }
}
