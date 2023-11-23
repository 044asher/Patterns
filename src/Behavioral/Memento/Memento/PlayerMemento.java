package Behavioral.Memento.Memento;

public class PlayerMemento {
    private int health;
    private int experience;
    private int level;

    public PlayerMemento(int health, int experience, int level){
        this.health = health;
        this.experience = experience;
        this.level = level;
    }
    public int getHealth() {
        return health;
    }
    public int getExperience() {
        return experience;
    }
    public int getLevel() {
        return level;
    }
}
