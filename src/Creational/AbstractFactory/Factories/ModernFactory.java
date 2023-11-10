package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.Interfaces.Factory;
import Creational.AbstractFactory.Interfaces.Tile;
import Creational.AbstractFactory.Interfaces.Wallpaper;
import Creational.AbstractFactory.TileCollections.ModernTile;
import Creational.AbstractFactory.TileCollections.ModernWallpaper;

public class ModernFactory implements Factory {
    @Override
    public Tile createTile() {
        return new ModernTile();
    }

    @Override
    public Wallpaper createWallpaper() {
        return new ModernWallpaper();
    }
}
