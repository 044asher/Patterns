package Behavioral.TemplateMethod.GameChar;

public class Mage extends GameCharacter{
    public Mage(String name){
        this.name = name;
    }
    @Override
    void selectCharacter() {
        System.out.println(name + " has selected the mage class.");
    }
    @Override
    void performAction() {
        System.out.println(name + " is casting powerful spells and using magic.");
    }
    @Override
    void levelUp() {
        System.out.println("Mage " + name + " leveled up and gained new magical abilities!");
    }
}
