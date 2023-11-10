package Creational.AbstractFactory.TileCollections;

import Creational.AbstractFactory.Interfaces.Tile;

public class ModernTile implements Tile {
    @Override
    public void create() {
        System.out.println("Modern Collection of Tile was created.");
    }
}
