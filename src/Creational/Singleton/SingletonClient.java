package Creational.Singleton;

public class SingletonClient {
    public static void main(String[] args) {
        TileStoreDatabase firstSingleton = TileStoreDatabase.getInstance("I'm first");
        TileStoreDatabase secondSingleton = TileStoreDatabase.getInstance("second");
        TileStoreDatabase thirdSingleton = TileStoreDatabase.getInstance("third");

        System.out.println(firstSingleton.value);
        System.out.println(secondSingleton.value);
        System.out.println(thirdSingleton.value);
    }
}
