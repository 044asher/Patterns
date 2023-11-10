package Creational.FactoryMethod.Restaurant;

import Creational.FactoryMethod.Food.Burgers;
import Creational.FactoryMethod.interfaces.FastFood;

public class BurgerFactory extends FastFoodFactory{
    @Override
    public FastFood createFastFood() {
        return new Burgers();
    }
}
