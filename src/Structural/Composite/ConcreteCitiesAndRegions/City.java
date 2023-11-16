package Structural.Composite.ConcreteCitiesAndRegions;

import Structural.Composite.CityRegion.AbstractCityRegion;

public class City extends AbstractCityRegion {
    public City(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("City: " + name);
    }
}
