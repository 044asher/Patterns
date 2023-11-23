package Behavioral.Command.Orders;

public class PlaceOrderCommand extends OrderCommand{

    public PlaceOrderCommand(OrderService orderService) {
        super(orderService);
    }

    @Override
    public void execute() {
        orderService.placeOrder();
    }
}
