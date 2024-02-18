package objects;

import java.awt.*;

import static helpz.Constants.Direction.*;
import static helpz.Constants.ItemsType.getDefaultCost;

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
        this.itemType=itemType;
        setCost();
    }

    private void setCost() {
        cost=getDefaultCost(itemType);
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

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setHitBox(Rectangle hitBox) {
        this.hitBox = hitBox;
    }

    public int getItemType(){
        return itemType;
    }


    public Rectangle getHitBox() {
        return hitBox;
    }

    public int getCost() {
        return cost;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
