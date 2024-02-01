package buildings;

public class Furnace {
    private int x, y, rotation;
    private int id;

    public Furnace(int x, int y, int id,int rotation){
        this.x = x;
        this.y = y;
        this.id = id;
        this.rotation=rotation;
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

    public int getRotation() {
        return rotation;
    }
}
