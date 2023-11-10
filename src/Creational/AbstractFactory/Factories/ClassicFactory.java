package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Interfaces.Factory;
import Creational.AbstractFactory.Interfaces.Tile;
import Creational.AbstractFactory.Interfaces.Wallpaper;
import Creational.AbstractFactory.TileCollections.ClassicTile;
import Creational.AbstractFactory.TileCollections.ClassicWallpaper;

public class ClassicFactory implements Factory {
    @Override
    public Tile createTile() {
        return new ClassicTile();
    }

    @Override
    public Wallpaper createWallpaper() {
        return new ClassicWallpaper();
    }
}
