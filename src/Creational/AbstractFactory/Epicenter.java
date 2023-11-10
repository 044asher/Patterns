package Creational.AbstractFactory;

import Creational.AbstractFactory.Factories.ModernFactory;
import Creational.AbstractFactory.Interfaces.Factory;
import Creational.AbstractFactory.Interfaces.Tile;
import Creational.AbstractFactory.Factories.ClassicFactory;
import Creational.AbstractFactory.Interfaces.Wallpaper;

public class Epicenter {
    public static void main(String[] args) {

        Factory classicFactory = new ClassicFactory();
        Factory modernFactory = new ModernFactory();

        //Classic Factory
        Tile classicTile = classicFactory.createTile();
        classicTile.create();

        Wallpaper classicWallpaper = classicFactory.createWallpaper();
        classicWallpaper.create();

        //Modern Factory
        Tile modernTile = modernFactory.createTile();
        modernTile.create();

        Wallpaper modernWallpaper = modernFactory.createWallpaper();
        modernWallpaper.create();
    }
}

