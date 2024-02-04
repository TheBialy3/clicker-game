package buildings;

public class Splitter  extends Building{
    private int heightInTiles = 1, wightInTiles = 1;
    private int rotation;
    public Splitter(int x, int y, int id,int rotation){
        super(x,y,id);
        this.rotation=rotation;
    }


    public int getRotation() {
        return rotation;
    }
}
