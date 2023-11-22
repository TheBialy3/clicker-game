package objects;

public class Belt {
    private int x, y, rotation;
    private int id;
    private int beltType;

    public Belt(int x, int y, int id, int beltType,int rotation) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.beltType = beltType;
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

    public int getBeltType() {
        return beltType;
    }
}
