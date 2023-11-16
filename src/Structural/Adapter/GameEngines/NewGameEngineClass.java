package Structural.Adapter.GameEngines;

import Structural.Adapter.Interfaces.NewGameEngine;

public class NewGameEngineClass implements NewGameEngine {
    @Override
    public void startNewGameEngine() {
        System.out.println("Starting Game with NEW Game Engine.");
    }
}
