package Behavioral.ChainOfResponsibility;


import Behavioral.ChainOfResponsibility.Orders.*;


public class SushiPizza {
    public static void main(String[] args) {

        NameAndPhoneNumber nameAndPhoneNumber = new NameAndPhoneNumber();
        Address address = new Address();
        Payment payment = new Payment();

        nameAndPhoneNumber.setNextStep(address);
        address.setNextStep(payment);

        Order order = new Order();
        order.setName("John Doe");
        order.setPhoneNumber("+380666645882");
        order.setAddress("Main Street 1");
        order.setPaymentSuccessful(false);

        nameAndPhoneNumber.processTheOrder(order);
    }
}
