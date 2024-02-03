package buildings;

import java.awt.*;

import static helpz.Constants.NumbersOf.TILE_PIXEL_NUMBER;

public class Warehouse  extends Building{
private int heightInTiles=3,wightInTiles=3;
    private Rectangle hitbox= new Rectangle(x,y, TILE_PIXEL_NUMBER*wightInTiles,TILE_PIXEL_NUMBER*heightInTiles);;

    public Warehouse(int x, int y, int id, int capacity) {

       super(x,y,id,hitbox);
        getHitbox(x,y);
    }

    private void getHitbox(int x, int y) {


    }


}
