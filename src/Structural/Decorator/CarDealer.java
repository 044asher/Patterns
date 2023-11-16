package Structural.Decorator;

import Structural.Decorator.BasicCars.BasicCar;
import Structural.Decorator.BasicCars.Car;
import Structural.Decorator.Decorators.AutoPilot;
import Structural.Decorator.Decorators.ClimateControl;
import Structural.Decorator.Decorators.LeatherInterior;

public class CarDealer {
    public static void main(String[] args) {


        Car basicCar = new BasicCar("Honda Accord Hybrid");
        Car carWithAutoPilot = new AutoPilot(basicCar);
        Car carWithApAndCc = new ClimateControl(carWithAutoPilot);
        Car allInclusive = new LeatherInterior(carWithApAndCc);


        basicCar.create(); System.out.println();
        carWithAutoPilot.create(); System.out.println();
        carWithApAndCc.create(); System.out.println();
        allInclusive.create(); System.out.println();


        Car basicCar1 = new AutoPilot(new LeatherInterior(new ClimateControl(new BasicCar("Tesla Model S"))));
        basicCar1.create();
    }
}