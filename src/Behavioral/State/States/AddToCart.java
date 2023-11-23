package Behavioral.State.States;

import Behavioral.State.Interfaces.PurchaseState;

public class AddToCart implements PurchaseState {
    @Override
    public void processPurchase(OnlinePurchase purchase) {
        System.out.println("Adding item to your Shopping Cart.");
        purchase.setCurrentState(new Payment());
        purchase.processPurchase();
    }
}
