package com.ryanpodell.videogameproject;

import com.ryanpodell.videogameproject.game.GameRunner;
import com.ryanpodell.videogameproject.game.MarioGame;
import com.ryanpodell.videogameproject.game.PacmanGame;
import com.ryanpodell.videogameproject.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();  //object
        var gameRunner = new GameRunner(game);  //object + wiring of dependencies (game is dependency of GameRunner or injected in)
        gameRunner.run();
    }
}
