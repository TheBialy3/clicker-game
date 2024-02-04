package buildings;

public class Furnace  extends Building{
    private int heightInTiles = 2, wightInTiles = 2;
    private int rotation;
    public Furnace(int x, int y, int id,int rotation){
        super(x,y,id);
        this.rotation=rotation;
    }


    public int getRotation() {
        return rotation;
    }
}
