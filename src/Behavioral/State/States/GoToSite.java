package Behavioral.State.States;

import Behavioral.State.Interfaces.PurchaseState;

public class GoToSite implements PurchaseState {
    @Override
    public void processPurchase(OnlinePurchase purchase) {
        System.out.println("Going to the site.");
        purchase.setCurrentState(new AddToCart());
        purchase.processPurchase();
    }
}
