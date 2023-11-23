package Behavioral.ChainOfResponsibility.Orders;

import Behavioral.ChainOfResponsibility.Interface.OrdersInterface;

public class NameAndPhoneNumber implements OrdersInterface {
    private OrdersInterface nextStep;

    public void setNextStep(OrdersInterface nextStep) {
        this.nextStep = nextStep;
    }

    @Override
    public void processTheOrder(Order order) {
        if (order.isNameAndPhoneNumberValid()) {
            System.out.println("Phone number and name checked successful.");
            nextStep.processTheOrder(order);
        } else
            System.out.println("Not valid phone number or name.");

    }
}


