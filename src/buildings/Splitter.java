package buildings;

import java.awt.*;

public class Splitter  extends Building{
    private int heightInTiles = 1, wightInTiles = 1;
    private int rotation,rotationOfItemOutput=0;
    private Rectangle hitBox;
    public Splitter(int x, int y, int id,int rotation){
        super(x,y,id);
        this.rotation=rotation;
        hitBox=new Rectangle(x,y,64,64);
    }

    public Rectangle getHitBox() {
        return hitBox;
    }
public void increaseRotationOfItemOutput(){
    rotationOfItemOutput++;
    checkResetRotationOfItemOutput();
    if(rotationOfItemOutput==rotation){
        rotationOfItemOutput++;
    }
    checkResetRotationOfItemOutput();
}
public void checkResetRotationOfItemOutput(){
    if(rotationOfItemOutput>3){
        rotationOfItemOutput=0;
    }
}
    public int getRotationOfItemOutput() {
        return rotationOfItemOutput;
    }

    public int getRotation() {
        return rotation;
    }
}
