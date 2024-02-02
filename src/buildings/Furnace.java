package buildings;

public class Furnace  extends Building{
    private int x, y, rotation;
    private int id;

    public Furnace(int x, int y, int id,int rotation){
        super(x,y,id);
    }


    public int getRotation() {
        return rotation;
    }
}
