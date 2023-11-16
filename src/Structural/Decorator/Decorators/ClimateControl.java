package Structural.Decorator.Decorators;

import Structural.Decorator.BasicCars.Car;

public class ClimateControl implements Car {
    private Car car;
    public ClimateControl(Car car){
        this.car = car;
    }
    @Override
    public void create() {
        car.create();
        System.out.println("Climate Control added.");
    }
}
