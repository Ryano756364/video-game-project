package com.ryanpodell.videogameproject;

import com.ryanpodell.videogameproject.game.GameRunner;
import com.ryanpodell.videogameproject.game.MarioGame;
import com.ryanpodell.videogameproject.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        //var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);  //this will not work because GameRunner class is tightly coupled to MarioGame
        gameRunner.run();
    }
}

// A car engine is tightly coupled - changing an engine takes a lot of work
// A wheel is loosely coupled to a car
// Laptop is not tightly coupled to any specific place
// However, a desktop computer is

// Coupling is very important in building great software
// Want loose coupling as much as possible
