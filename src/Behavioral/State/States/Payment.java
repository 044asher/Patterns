package Behavioral.State.States;

import Behavioral.State.Interfaces.PurchaseState;

public class Payment implements PurchaseState {
    @Override
    public void processPurchase(OnlinePurchase purchase) {
        System.out.println("Payment successful. Order complete.");
    }
}
