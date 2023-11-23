package Behavioral.Memento.Game;

import Behavioral.Memento.Memento.PlayerMemento;

public class PlayerCharacter {
    private String name;
    private int health;
    private int experience;
    private int level;
    public PlayerCharacter (String name, int health, int experience, int level){
        this.name = name;
        this.health = health;
        this.experience = experience;
        this.level = level;
    }
    public void takeDamage(int damage){
        health -= damage;
        System.out.println(name + " took " + damage + " damage. Health: " + health);
    }
    public void gainExperience(int experience){
        this.experience += experience;
        System.out.println(name + " gained " + experience + " experience. Total exp: " + this.experience);
        if (this.experience >= 100){
            lvlUp();
        }
    }
    private void lvlUp(){
        level++;
        experience = 0;
        System.out.println(name + " reached " + level + " level!");
    }

    public PlayerMemento saveGame(){
        return new PlayerMemento(health, experience, level);
    }
    public void restoreFromMemento(PlayerMemento memento) {
        health = memento.getHealth();
        experience = memento.getExperience();
        level = memento.getLevel();
        System.out.println(name + " restored to level " + level + " with " + health + " health and " + experience + " experience.");
    }
}
