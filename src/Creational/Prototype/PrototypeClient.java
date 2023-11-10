package Creational.Prototype;

import Creational.Prototype.Products.Car;


public class PrototypeClient {
    public static void main(String[] args) {
        Car originalcar = new Car("Toyota", "Camry", 3.5);
        Car cloneOfCar = originalcar.clone();

        originalcar.print();
        cloneOfCar.print();
        if (originalcar != cloneOfCar){
            System.out.println("Ссылки на объекты не равны.\n");
        }


        Car car1 = new Car("Tesla", "Model S", 0);
        Car car1clone = car1.clone();

        car1.print();
        car1clone.print();
    }
}
