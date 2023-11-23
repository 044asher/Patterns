package Structural.Composite.CityRegion;

public abstract class AbstractCityRegion implements CityRegion {
    protected String name;
    public AbstractCityRegion(String name){
        this.name = name;
    }
    public abstract void displayInfo();

}
