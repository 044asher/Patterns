package Behavioral.TemplateMethod;

import Behavioral.TemplateMethod.GameChar.Mage;
import Behavioral.TemplateMethod.GameChar.Warrior;

public class EldenRing {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Aragorn");
        Mage mage = new Mage("Gandalf");

        System.out.println("Playing as warrior.");
        warrior.play();

        System.out.println("\nPlaying as mage.");
        mage.play();
    }
}
