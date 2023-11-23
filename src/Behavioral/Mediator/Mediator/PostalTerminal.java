package Behavioral.Mediator.Mediator;

import Behavioral.Mediator.Interfaces.LogisticsComponent;
import Behavioral.Mediator.Interfaces.LogisticsMediator;

public class PostalTerminal implements LogisticsMediator {
    private LogisticsComponent truck;
    private LogisticsComponent courier;
    public void setTruck(LogisticsComponent truck){
        this.truck = truck;
        this.truck.setLogisticMediator(this);
    }
    public void setCourier(LogisticsComponent courier) {
        this.courier = courier;
        this.courier.setLogisticMediator(this);
    }
    @Override
    public void sendPackage(String packageContent, LogisticsComponent sender) {
        if (sender == truck) {
            courier.receivePackage(packageContent);
        } else if (sender == courier) {
            truck.receivePackage(packageContent);
        }
    }

    @Override
    public void receivePackage(String packageContent, LogisticsComponent receiver) {
        System.out.println("Post Terminal received package " + packageContent);
    }
}
