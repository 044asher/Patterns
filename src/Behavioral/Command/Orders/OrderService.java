package Behavioral.Command.Orders;

public class OrderService {
        private boolean orderPlaced;
        public void placeOrder(){
            orderPlaced = true;
            System.out.println("Order Placed.");
        }
        public void cancelOrder(){
            orderPlaced = false;
            System.out.println("Order cancelled");
        }
        public boolean isOrderPlaced(){
            return orderPlaced;
        }
}
