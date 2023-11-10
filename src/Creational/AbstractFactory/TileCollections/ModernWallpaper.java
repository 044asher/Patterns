package Creational.AbstractFactory.TileCollections;

import Creational.AbstractFactory.Interfaces.Wallpaper;

public class ModernWallpaper implements Wallpaper {
    @Override
    public void create() {
        System.out.println("Modern Wallpapers were created.");
    }
}
