package buildings;

import objects.Item;

import java.util.ArrayList;

import static helpz.Constants.BeltType.getBeltLvlSpeed;

public class Belt {
    private int heightInTiles = 1, wightInTiles = 1;

    private int x, y;
    private int id;
    private int rotation;
    private int beltType,beltLvl;

    public Belt(int x, int y, int id, int beltType,int rotation,int beltLvl) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.rotation=rotation;
        this.beltType=beltType;
        this.beltLvl=beltLvl;
    }



    public int getRotation() {
        return rotation;
    }

    public int getBeltType() {
        return beltType;
    }
}
