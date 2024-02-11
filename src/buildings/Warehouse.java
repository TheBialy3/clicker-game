package buildings;

import objects.Item;

import java.awt.*;
import java.util.ArrayList;

import static helpz.Constants.NumbersOf.TILE_PIXEL_NUMBER;

public class Warehouse extends Building {
    private int heightInTiles = 3, wightInTiles = 3;

    private ArrayList<Item> itemInside = new ArrayList<>();
private  int capacity;
    public Warehouse(int x, int y, int id, int capacity) {
        super(x, y, id);
        this.capacity=capacity;
        setHitbox(getHitbox(x,y));
    }

    private Rectangle getHitbox(int x, int y) {
        Rectangle hitbox = new Rectangle(x, y, TILE_PIXEL_NUMBER * wightInTiles, TILE_PIXEL_NUMBER * heightInTiles);
        return hitbox;
    }




}
