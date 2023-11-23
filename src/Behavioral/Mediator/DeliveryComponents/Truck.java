package Behavioral.Mediator.DeliveryComponents;

import Behavioral.Mediator.Interfaces.LogisticsComponent;
import Behavioral.Mediator.Interfaces.LogisticsMediator;

public class Truck implements LogisticsComponent {
    private LogisticsMediator mediator;
    @Override
    public void setLogisticMediator(LogisticsMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendPackage(String packageContent) {
        System.out.println("Truck is delivering package: " + packageContent);
        mediator.sendPackage(packageContent, this);
    }

    @Override
    public void receivePackage(String packageContent) {
        System.out.println("Truck received package: " + packageContent);
    }
}
