package Behavioral.State.States;

import Behavioral.State.Interfaces.PurchaseState;

public class OnlinePurchase {
    private PurchaseState currentState;
    public OnlinePurchase(){
        currentState = new GoToSite();
    }
    public void setCurrentState(PurchaseState currentState) {
        this.currentState = currentState;
    }

    public void processPurchase() {
        currentState.processPurchase(this);
    }
}
