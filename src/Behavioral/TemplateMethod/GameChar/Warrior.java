package Behavioral.TemplateMethod.GameChar;

public class Warrior extends GameCharacter{
    public Warrior(String name){
        this.name = name;
    }
    @Override
    void selectCharacter() {
        System.out.println(name + " has selected the Warrior class.");
    }

    @Override
    void performAction() {
        System.out.println(name + " is wielding a powerful sword and engaging in combat.");
    }
    @Override
    void levelUp(){
        System.out.println("Warrior " + name + " leveled up and gained new combat skills.");
    }
}
