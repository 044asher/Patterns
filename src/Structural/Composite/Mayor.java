package Structural.Composite;

import Structural.Composite.ConcreteCitiesAndRegions.City;
import Structural.Composite.ConcreteCitiesAndRegions.Region;

public class Mayor {
    public static void main(String[] args) {
        Region Ukraine = new Region("Ukraine");
        Region sumyRegion = new Region("Sumy oblast");
        Region kievRegion = new Region("Kiev oblast");


        City Sumy = new City("Sumy");
        City Trostyanets = new City("Trostyanets");
        City Kiev = new City("Kiev");
        Sumy.displayInfo(); System.out.println();

        Ukraine.addComponent(sumyRegion);
        Ukraine.addComponent(kievRegion);

        sumyRegion.addComponent(Sumy);
        sumyRegion.addComponent(Trostyanets);
        kievRegion.addComponent(Kiev);

        Ukraine.displayInfo(); System.out.println();


        sumyRegion.removeComponent(Trostyanets);
        sumyRegion.displayInfo();


    }
}
