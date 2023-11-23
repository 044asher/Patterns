package Behavioral.Command.Orders;

public abstract class OrderCommand {
    public OrderService orderService;
    public OrderCommand(OrderService orderService){
        this.orderService = orderService;
    }
    public abstract void execute();
}
