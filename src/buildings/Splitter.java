package buildings;

public class Splitter  extends Building{
    private int x, y, rotation;
    private int id;
    public Splitter(int x, int y, int id,int rotation){
        super(x,y,id);
    }


    public int getRotation() {
        return rotation;
    }
}
