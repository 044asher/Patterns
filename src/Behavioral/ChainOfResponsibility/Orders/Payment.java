package Behavioral.ChainOfResponsibility.Orders;

import Behavioral.ChainOfResponsibility.Interface.OrdersInterface;

public class Payment implements OrdersInterface {

    @Override
    public void processTheOrder(Order order) {
        if(order.isPaymentSuccessful())
            System.out.println("Thanks for your order.");
        else
            System.out.println("Payment error. Please check your payment details.");
    }
}
