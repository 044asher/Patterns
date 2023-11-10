package Creational.AbstractFactory.TileCollections;

import Creational.AbstractFactory.Interfaces.Wallpaper;

public class ClassicWallpaper implements Wallpaper {

    @Override
    public void create() {
        System.out.println("Classic Wallpapers were created!");
    }
}
