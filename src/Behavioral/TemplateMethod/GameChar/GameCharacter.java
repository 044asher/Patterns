package Behavioral.TemplateMethod.GameChar;

abstract class GameCharacter {
    protected String name;
    public void play(){
        selectCharacter();
        performAction();
        levelUp();
    }
    abstract void selectCharacter();
    abstract void performAction();
    void levelUp(){
        System.out.println("Character leveled up!");
    }
}
