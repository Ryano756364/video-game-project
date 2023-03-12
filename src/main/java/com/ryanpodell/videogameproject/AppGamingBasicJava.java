package com.ryanpodell.videogameproject;

import com.ryanpodell.videogameproject.game.GameRunner;
import com.ryanpodell.videogameproject.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
