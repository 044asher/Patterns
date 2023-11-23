package Behavioral.ChainOfResponsibility.Orders;

import Behavioral.ChainOfResponsibility.Interface.OrdersInterface;

public class Address implements OrdersInterface {
    private OrdersInterface nextStep;

    public void setNextStep(OrdersInterface nextStep) {
        this.nextStep = nextStep;
    }

    @Override
    public void processTheOrder(Order order) {
        if (order.isAddressValid()) {
            System.out.println("Address checked successful");
            nextStep.processTheOrder(order);
        } else
            System.out.println("Error while validation your shipping address.");
    }


}
