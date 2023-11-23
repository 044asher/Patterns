package Behavioral.ChainOfResponsibility.Orders;

public class Order {
    private String name;
    private String phoneNumber;
    private String address;
    private boolean paymentSuccessful;

    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPaymentSuccessful(boolean paymentSuccessful) {
        this.paymentSuccessful = paymentSuccessful;
    }

    public boolean isNameAndPhoneNumberValid() {
        return true;
    }

    public boolean isAddressValid() {
        return true;
    }

    public boolean isPaymentSuccessful() {
        return paymentSuccessful;
    }
}
