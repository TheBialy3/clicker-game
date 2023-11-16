package managers;

import helpz.LoadSave;
import objects.Tile;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import static helpz.Constants.Direction.Tiles.GRASS_TILE;

public class TileManager {
    private BufferedImage atlas;
    public Tile GRASS, WATER, ROAD, ROAD_TB, GRASS_DARK, GRASS_ORANGE;
    public ArrayList<Tile> grassT = new ArrayList<>();
    public TileManager() {
        loadAtlas();
        createTiles();
    }

    private void loadAtlas() {
        atlas = LoadSave.getSpriteAtlas();
    }
    private void createTiles() {
        int id = 0;
        grassT.add(GRASS = new Tile(getSprite(2, 0), id++, GRASS_TILE));
        grassT.add(GRASS_DARK = new Tile(getSprite(3, 0), id++, GRASS_TILE));
    }

    private BufferedImage getSprite(int xCord, int yCord) {
        return atlas.getSubimage(xCord * 64, yCord * 64, 64, 64);
    }

    public BufferedImage getSprite(int id) {
        return grassT.get(id).getSprite();
    }
}
