package scenes;

import helpz.ArrayListsToGet;
import helpz.LoadSave;
import main.Game;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import static helpz.LoadSave.GetLevelData;

public class Playing extends GameScene implements SceneMethods {

    private int mapY = 40, mapX = 40;
    private ArrayListsToGet arrayListsToGet;
    private int screenY = 10, screenX = 10;//from40x40 u see from 10 to 30;
    private int heightOfScreen = 20, wightOfScreen = 24;
    private int[][] lvl = new int[heightOfScreen][wightOfScreen], wholeLVL;

    private int gold = 100, levelCost = 100;

    public void getGameArrayLists() {
        arrayListsToGet=game.getArrayListsToGet();
    }

    public enum PlayGameState {
        PLAY_PLAY,
        PLAY_PAUSED,
        PLAY_WIN,
        PLAY_CARD_SELECT;
    }
    public enum PopupWindow {
        NONE,
        WAREHOUSE,
        BUILDINGS,

        PLAY_CARD_SELECT;
    }

    PlayGameState playState = PlayGameState.PLAY_PLAY;
    PopupWindow popupWindow = PopupWindow.NONE;


    //help units
    private int tilePixelNumber = 64;

    public Playing(Game game) {
        super(game);
        getLevel();
    }


    public void update() {
        switch (playState) {
            case PLAY_PLAY:
                updateTick();
                break;
            case PLAY_PAUSED:
                break;
            case PLAY_WIN:
                break;

        }

    }

    @Override
    public void render(Graphics g) {
        drawLevel(g);
        drawResorcys(g);
        drawElements(g);
        drawPopups(g);
    }

    private void drawPopups(Graphics g) {
        switch (popupWindow) {
            case WAREHOUSE:
                break;
            case BUILDINGS:
                break;
            case NONE:
                break;

        }
    }

    private void drawResorcys(Graphics g) {
    }

    private void drawElements(Graphics g) {
    }

    private void getLevel() {
        wholeLVL = GetLevelData(mapY, mapX);
        for (int y = 0; y < mapY; y++) {
            for (int x = 0; x < mapX; x++) {
                System.out.print(wholeLVL[y][x]);
            }
            System.out.println();
        }
        getLevelScreen();
    }

    private void getLevelScreen() {
        for (int y = 0; y < heightOfScreen; y++) {
            System.arraycopy(wholeLVL[screenY + y], screenX, lvl[y], 0, wightOfScreen);
        }
    }

    private void drawLevel(Graphics g) {
        for (int y = 0; y < heightOfScreen; y++) {
            for (int x = 0; x < wightOfScreen; x++) {
                int id = lvl[y][x];
                g.drawImage(getSprite(id), x * tilePixelNumber, y * tilePixelNumber, null);
            }
        }
    }

    @Override
    public void mouseClicked(int x, int y) {

    }

    @Override
    public void mouseMoved(int x, int y) {

    }

    @Override
    public void mouseReleased(int x, int y) {

    }

    @Override
    public void mousePressed(int x, int y) {

    }

    @Override
    public void mouseDragged(int x, int y) {

    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_ESCAPE:
                if (playState == PlayGameState.PLAY_PLAY) {
                    playState = PlayGameState.PLAY_PAUSED;
                }
                break;
            case KeyEvent.VK_SPACE:
                if(enoughGold()){
                    levelUp();
                    playState=PlayGameState.PLAY_CARD_SELECT;
                }
                break;
            case KeyEvent.VK_E:

                break;
            case KeyEvent.VK_X:
                break;
            case KeyEvent.VK_C:
                break;
            case KeyEvent.VK_V:
                break;
            case KeyEvent.VK_A:
                if (screenX > 0) {
                    screenX--;
                    getLevelScreen();
                }
                break;
            case KeyEvent.VK_D:
                if (screenX < mapX - wightOfScreen) {
                    screenX++;
                    getLevelScreen();
                }
                break;
            case KeyEvent.VK_W:
                if (screenY > 0) {
                    screenY--;
                    getLevelScreen();
                }
                break;
            case KeyEvent.VK_S:
                if (screenY < mapY - heightOfScreen) {
                    screenY++;
                    getLevelScreen();
                }
                break;
        }
    }
    private boolean enoughGold(){
        return (gold>=levelCost);
    }

    private void levelUp(){
        gold-=levelCost;
        levelCost=levelCost+(levelCost/10);
    }

}
