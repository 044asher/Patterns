package Structural.Flyweight.Villages;

import java.util.HashMap;
import java.util.Map;

public class VillagesFactory {
    private static Map<String, VillageType> villageTypes = new HashMap<>();
    public static VillageType getVillageType(String biome, boolean hasChurch, int numFields){
        String type = biome + hasChurch + numFields;
        VillageType result = villageTypes.get(type);
        if (result == null) {
            result = new VillageType(biome, hasChurch, numFields);
            villageTypes.put(type, result);
        }

        return result;
    }
}
