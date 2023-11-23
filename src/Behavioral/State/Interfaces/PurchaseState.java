package Behavioral.State.Interfaces;

import Behavioral.State.States.OnlinePurchase;

public interface PurchaseState {
    void processPurchase(OnlinePurchase purchase);
}
