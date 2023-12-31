package main;

import java.awt.*;

public class Render {

    private Game game;


    public Render(Game game) {
        this.game = game;
    }

    public void render(Graphics g) {
        switch (GameStates.gameStates) {
            case PLAYING:
                game.getPlaying().render(g);
                break;
            case SETTINGS:
                game.getSettings().render(g);
                break;
            case UPGRADE:
                game.getUpgrade().render(g);
                break;
        }
    }
}
