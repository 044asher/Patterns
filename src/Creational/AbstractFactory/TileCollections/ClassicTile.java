package Creational.AbstractFactory.TileCollections;

import Creational.AbstractFactory.Interfaces.Tile;

public class ClassicTile implements Tile {
    @Override
    public void create() {
        System.out.println("Classic Collection of Tile was created!");
    }
}


