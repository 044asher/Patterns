package Structural.Decorator.Decorators;

import Structural.Decorator.BasicCars.Car;

public class LeatherInterior implements Car {
    private Car car;
    public LeatherInterior(Car car){
        this.car = car;
    }
    @Override
    public void create(){
        car.create();
        System.out.println("Leather Interior added.");
    }
}
