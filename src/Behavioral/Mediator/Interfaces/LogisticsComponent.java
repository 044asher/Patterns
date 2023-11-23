package Behavioral.Mediator.Interfaces;

public interface LogisticsComponent {
    void setLogisticMediator(LogisticsMediator mediator);
    void sendPackage(String packageContent);
    void receivePackage(String packageContent);
}
