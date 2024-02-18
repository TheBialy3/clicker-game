package buildings;

import java.awt.*;

public class Splitter  extends Building{
    private int heightInTiles = 1, wightInTiles = 1;
    private int rotation;
    private Rectangle hitBox;
    public Splitter(int x, int y, int id,int rotation){
        super(x,y,id);
        this.rotation=rotation;
        hitBox=new Rectangle(x,y,64,64);
    }

    public Rectangle getHitBox() {
        return hitBox;
    }


    public int getRotation() {
        return rotation;
    }
}
