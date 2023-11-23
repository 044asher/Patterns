package Behavioral.Mediator.Interfaces;

public interface LogisticsMediator {
    void sendPackage(String packageContent, LogisticsComponent sender);
    void receivePackage(String packageContent, LogisticsComponent receiver);
}
