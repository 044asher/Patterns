package Behavioral.State;

import Behavioral.State.States.OnlinePurchase;

public class StateMall {
    public static void main(String[] args) {
        OnlinePurchase purchase = new OnlinePurchase();
        purchase.processPurchase();
    }
}
