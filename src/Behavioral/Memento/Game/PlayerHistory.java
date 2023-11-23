package Behavioral.Memento.Game;

import Behavioral.Memento.Memento.PlayerMemento;

import java.util.ArrayList;
import java.util.List;

public class PlayerHistory {
    private List<PlayerMemento> mementos = new ArrayList<>();
    public void addMemento(PlayerMemento memento){
        mementos.add(memento);
    }
    public PlayerMemento getMemento(int index){
        return mementos.get(index);
    }

    public int getSize() {
        return mementos.size();
    }
}
