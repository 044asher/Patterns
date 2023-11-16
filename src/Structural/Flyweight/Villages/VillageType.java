package Structural.Flyweight.Villages;

public class VillageType {
    private String biome;
    private boolean hasChurch;
    private int numFields;
    public VillageType(String biome, boolean hasChurch, int numFields){
        this.biome = biome;
        this.hasChurch = hasChurch;
        this.numFields = numFields;
    }
    public String getBiome(){
        return biome;
    }
    public boolean isHasChurch(){
        return hasChurch;
    }
    public int getNumFields(){
        return numFields;
    }
}
