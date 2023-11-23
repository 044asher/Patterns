package Behavioral.Memento;

import Behavioral.Memento.Game.PlayerCharacter;
import Behavioral.Memento.Game.PlayerHistory;
import Behavioral.Memento.Memento.PlayerMemento;

public class GameExample {
    public static void main(String[] args) {
        PlayerCharacter player = new PlayerCharacter("Warrior", 100, 70, 1);
        PlayerHistory history = new PlayerHistory();

        player.takeDamage(45);
        player.gainExperience(20);

        history.addMemento(player.saveGame());

        player.takeDamage(20);
        player.gainExperience(20);


        PlayerMemento lastMemento = history.getMemento(history.getSize() - 1);
        player.restoreFromMemento(lastMemento);

    }
}
