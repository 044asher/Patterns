package Structural.Adapter.Adapters;

import Structural.Adapter.Interfaces.NewGameEngine;
import Structural.Adapter.Interfaces.OldGameEngine;

public class GameEngineAdapter implements OldGameEngine {
    private NewGameEngine newGameEngine;
    public GameEngineAdapter(NewGameEngine newGameEngine){
        this.newGameEngine = newGameEngine;
    }
    @Override
    public void startOldGameEngine() {
        newGameEngine.startNewGameEngine();
    }
}