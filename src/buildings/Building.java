package buildings;

import objects.Item;

import java.awt.*;

public class Building {
    private int x, y;
    private int id;
    private Rectangle hitbox;
    public Building(int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public void update(){

    }

    public void setHitbox(Rectangle hitbox) {
        this.hitbox=hitbox;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getId() {
        return id;
    }

    public Rectangle getHitbox() {
        return hitbox;
    }


}
