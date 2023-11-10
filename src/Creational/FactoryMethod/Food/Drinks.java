package Creational.FactoryMethod.Food;

import Creational.FactoryMethod.interfaces.FastFood;

public class Drinks implements FastFood {
    @Override
    public void prepare() {
        System.out.println("Drink is pouring.");
    }

    @Override
    public void serve() {
        System.out.println("Here is your drink.");
    }
}
