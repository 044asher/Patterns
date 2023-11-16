package Structural.Flyweight;

import Structural.Flyweight.Villages.Village;
import Structural.Flyweight.Villages.VillageType;
import Structural.Flyweight.Villages.VillagesFactory;

public class Minecraft {
    public static void main(String[] args) {
        VillageType villageType1 = VillagesFactory.getVillageType("Plains", true, 3);
        VillageType villageType2 = VillagesFactory.getVillageType("Forest", false, 2);


        Village village1 = new Village(10, 20, villageType1);
        Village village2 = new Village(15, 25, villageType2);
        Village village3 = new Village(-305, 204, villageType1);


        System.out.println("Village 1 - Coord. x: " + village1.getX() + ", y: " + village1.getY() + ", Type: " + village1.getType().getBiome());
        System.out.println("Village 2 - Coord. x: " + village2.getX() + ", y: " + village2.getY() + ", Type: " + village2.getType().getBiome());
        System.out.println("Village 3 - Coord. x: " + village3.getX() + ", y: " + village3.getY() + ", Type: " + village3.getType().getBiome());

        System.out.println("\nVillage Type 1 - Biome: " + villageType1.getBiome() + "; Church: " + villageType1.isHasChurch() + "; Fields: " + villageType1.getNumFields());
        System.out.println("Village Type 2 - Biome: " + villageType2.getBiome() + "; Church: " + villageType2.isHasChurch() + "; Fields: " + villageType2.getNumFields());
    }
}
