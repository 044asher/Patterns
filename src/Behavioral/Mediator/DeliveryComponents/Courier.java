package Behavioral.Mediator.DeliveryComponents;

import Behavioral.Mediator.Interfaces.LogisticsComponent;
import Behavioral.Mediator.Interfaces.LogisticsMediator;

public class Courier implements LogisticsComponent {
    private LogisticsMediator mediator;
    @Override
    public void setLogisticMediator(LogisticsMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendPackage(String packageContent) {
        System.out.println("Courier is sending package: " + packageContent);
        mediator.sendPackage(packageContent, this);
    }

    @Override
    public void receivePackage(String packageContent) {
        System.out.println("Courier received package: " + packageContent);
    }
}
