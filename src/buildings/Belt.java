package buildings;

public class Belt {
    private int heightInTiles = 1, wightInTiles = 1;
    private int x, y;
    private int id;
    private int rotation;
    private int beltType;

    public Belt(int x, int y, int id, int beltType,int rotation) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.rotation=rotation;
        this.beltType=beltType;
    }


    public int getRotation() {
        return rotation;
    }

    public int getBeltType() {
        return beltType;
    }
}
