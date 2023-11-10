package Creational.Singleton;

public final class TileStoreDatabase {
    private static TileStoreDatabase instance;
    public String value;
    private TileStoreDatabase(String value){
        this.value = value;
    }

    public static synchronized TileStoreDatabase getInstance(String value) {
        if(instance == null) {
            instance = new TileStoreDatabase(value);
        }
        return instance;
    }
}
