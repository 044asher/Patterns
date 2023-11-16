package Structural.Adapter;

import Structural.Adapter.Adapters.GameEngineAdapter;
import Structural.Adapter.GameEngines.NewGameEngineClass;
import Structural.Adapter.GameEngines.OldGameEngineClass;
import Structural.Adapter.Interfaces.NewGameEngine;
import Structural.Adapter.Interfaces.OldGameEngine;

public class Game {
    public static void main(String[] args) {
        //OldGameEngine oldGameEngine = new OldGameEngineClass();
        NewGameEngine newGameEngine = new NewGameEngineClass();

        GameEngineAdapter adapter = new GameEngineAdapter(newGameEngine);



        //oldGameEngine.startOldGameEngine();
        //newGameEngine.startNewGameEngine();

        adapter.startOldGameEngine();

    }
}
