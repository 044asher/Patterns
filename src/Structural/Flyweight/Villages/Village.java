package Structural.Flyweight.Villages;

public class Village {
    private int x;
    private int y;
    private VillageType type;
    public Village(int x, int y, VillageType type){
        this.x = x;
        this.y = y;
        this.type = type;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public VillageType getType(){
        return type;
    }

}
