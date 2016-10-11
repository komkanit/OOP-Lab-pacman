package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;

public class World {
    private Pacman pacman;
    private PacmanGame pacmanGame;
    private Maze maze;
    
    World(PacmanGame pacmanGame) {
        maze = new Maze();
        pacman = new Pacman(60,60,maze);
        this.pacmanGame = pacmanGame;
    }
    Maze getMaze() {
        return maze;
    }
 
    Pacman getPacman() {
        return pacman;
    }
    public void update(float delta) {
        pacman.update();
    }
    
}