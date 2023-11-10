package Creational.FactoryMethod.Restaurant;

import Creational.FactoryMethod.Food.Drinks;
import Creational.FactoryMethod.interfaces.FastFood;

public class DrinksFactory extends FastFoodFactory{
    @Override
    public FastFood createFastFood() {
        return new Drinks();
    }
}
