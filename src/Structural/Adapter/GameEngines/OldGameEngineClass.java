package Structural.Adapter.GameEngines;

import Structural.Adapter.Interfaces.OldGameEngine;

public class OldGameEngineClass implements OldGameEngine {
    @Override
    public void startOldGameEngine() {
        System.out.println("Starting Game with OLD Game Engine.");
    }
}
