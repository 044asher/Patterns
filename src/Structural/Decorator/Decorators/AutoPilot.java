package Structural.Decorator.Decorators;

import Structural.Decorator.BasicCars.Car;

public class AutoPilot implements Car {
    private Car car;
    public AutoPilot(Car car) {
        this.car = car;
    }

    @Override
    public void create(){
        car.create();
        System.out.println("AutoPilot added.");
    }
}
