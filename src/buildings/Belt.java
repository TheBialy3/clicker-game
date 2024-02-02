package buildings;

public class Belt  extends Building{
    private int x, y, rotation;
    private int id;
    private int beltType;

    public Belt(int x, int y, int id, int beltType,int rotation) {
        super(x,y,id);
    }


    public int getRotation() {
        return rotation;
    }

    public int getBeltType() {
        return beltType;
    }
}
