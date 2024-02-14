package objects;

import java.awt.*;

import static helpz.Constants.Direction.*;
import static helpz.Constants.ItemsType.getCost;

public class Item {

    private  float x,y;
    private  int itemType,cost;
    private Rectangle hitBox;
    public Item(float x, float y ,int itemType){
        this.x=x;
        this.y=y;
        this.itemType=itemType;
        hitBox = new Rectangle((int) x, (int) y, 20, 20);
        setCost();
    }

    public Item(int itemType){
        this.x=x;
        this.y=y;
        this.itemType=itemType;
        setCost();
    }

    private void setCost() {
        cost=getCost(itemType);
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

    public int getItemType(){
        return itemType;
    }


    public Rectangle getHitBox() {
        return hitBox;
    }
}
