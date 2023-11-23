package Behavioral.Mediator;

import Behavioral.Mediator.DeliveryComponents.Courier;
import Behavioral.Mediator.DeliveryComponents.Truck;
import Behavioral.Mediator.Interfaces.LogisticsComponent;
import Behavioral.Mediator.Mediator.PostalTerminal;

public class NovaPost {
    public static void main(String[] args) {

        LogisticsComponent truck = new Truck();
        LogisticsComponent courier = new Courier();
        PostalTerminal postalTerminal = new PostalTerminal();

        postalTerminal.setTruck(truck);
        postalTerminal.setCourier(courier);

        truck.sendPackage("Mirror 180x60");
        courier.sendPackage("xBox");

    }
}
