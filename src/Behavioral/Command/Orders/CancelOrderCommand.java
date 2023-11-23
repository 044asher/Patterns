package Behavioral.Command.Orders;

public class CancelOrderCommand extends OrderCommand{
    public CancelOrderCommand(OrderService orderService) {
        super(orderService);
    }

    @Override
    public void execute() {
        orderService.cancelOrder();
    }
}
