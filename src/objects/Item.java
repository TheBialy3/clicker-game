package objects;

import java.awt.*;

import static helpz.Constants.Direction.*;

public class Item {

    private  float x,y;
    private  int itemType;
    private Rectangle hitbox;
    public Item(float x, float y ,int itemType){
        this.x=x;
        this.y=y;
        this.itemType=itemType;
    }

    public void moveItem(float speed,int direction ){
        switch (direction) {
            case LEFT:
                this.x -= speed;
                break;
            case UP:
                this.y -= speed;
                break;
            case RIGHT:
                this.x += speed;
                break;
            case DOWN:
                this.y += speed;
                break;
        }
    }


}
