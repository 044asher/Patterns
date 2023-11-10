package Creational.FactoryMethod.Food;

import Creational.FactoryMethod.interfaces.FastFood;

public class Burgers implements FastFood {
    @Override
    public void prepare() {
        System.out.println("Burger is preparing!");
    }

    @Override
    public void serve() {
        System.out.println("Burger is serving!");
    }

}
