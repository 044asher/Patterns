package Creational.FactoryMethod;

import Creational.FactoryMethod.Restaurant.BurgerFactory;
import Creational.FactoryMethod.Restaurant.DrinksFactory;
import Creational.FactoryMethod.Restaurant.FastFoodFactory;
import Creational.FactoryMethod.interfaces.FastFood;

public class FoodCafe {
    public static void main(String[] args) {
        FastFoodFactory burgerFactory = new BurgerFactory();
        FastFoodFactory drinksFactory = new DrinksFactory();

        FastFood burger = burgerFactory.createFastFood();
        burger.prepare();
        burger.serve();

        FastFood drinks = drinksFactory.createFastFood();
        drinks.prepare();
        drinks.serve();
    }

}