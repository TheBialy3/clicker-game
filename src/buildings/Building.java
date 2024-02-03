package buildings;

import java.awt.*;

public class Building {
    private int x, y;
    private int id;
    private Rectangle hitbox,hitbox1,hitbox2;
    public Building(int x, int y, int id,Rectangle hitbox) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.hitbox=hitbox;
    }
    public Building(int x, int y, int id,Rectangle hitbox,Rectangle hitbox1,Rectangle hitbox2) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.hitbox=hitbox;
        this.hitbox1=hitbox1;
        this.hitbox2=hitbox2;

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
}
