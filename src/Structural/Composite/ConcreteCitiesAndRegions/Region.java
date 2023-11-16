package Structural.Composite.ConcreteCitiesAndRegions;

import Structural.Composite.CityRegion.AbstractCityRegion;
import Structural.Composite.CityRegion.CityRegion;

import java.util.ArrayList;
import java.util.List;

public class Region extends AbstractCityRegion {
    private List<CityRegion> components = new ArrayList<>();
    public Region(String name) {
        super(name);
    }

    public void addComponent(CityRegion component){
        components.add(component);
    }

    public void removeComponent(CityRegion component){
        components.remove(component);
    }
    @Override
    public void displayInfo() {
        System.out.println("Region: " + name);
        for (CityRegion component : components) {
            component.displayInfo();
        }
    }
}
