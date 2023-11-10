package Creational.Prototype.Products;

import Creational.Prototype.Interfaces.CloneableCar;

public class Car implements CloneableCar {
    public String company;
    public String model;
    public double engineL;


    public Car(String company, String model, double engineL) {
        this.company = company;
        this.model = model;
        this.engineL = engineL;
    }

    public Car(Car secondCar){
        this.company = secondCar.company;
        this.model = secondCar.model;
        this.engineL = secondCar.engineL;
    }
    public Car clone(){
        return new Car(this);
    }
    public void print(){
        System.out.println(company + " " + model + " " + engineL );
    }
}
