package inputs;

import main.Game;
import main.GameStates;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import static main.GameStates.*;

public class MyMouseListener implements MouseListener, MouseMotionListener {

    private Game game;

    public MyMouseListener(Game game){
        this.game = game;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        switch(GameStates.gameStates){

        }
    }
    @Override
    public void mousePressed(MouseEvent e) {
        switch(GameStates.gameStates){

        }

    }
    @Override
    public void mouseReleased(MouseEvent e) {
        switch(GameStates.gameStates){

        }
    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        switch(GameStates.gameStates){

        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        switch(GameStates.gameStates){
            case PLAYING:
       //         game.getPlaying().mouseMoved(e.getX(),e.getY());
                break;
            case SETTINGS:
//                game.getSettings().mouseMoved(e.getX(),e.getY());
                break;
            case UPGRADE:
//                game.getUpgrade().mouseMoved(e.getX(),e.getY());
                break;
        }
    }
}
