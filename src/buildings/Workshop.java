package buildings;

public class Workshop  extends Building{
    private int x, y, rotation;
    private int id;
    public Workshop(int x, int y, int id,int rotation){
        super(x,y,id);
    }

    public int getRotation() {
        return rotation;
    }
}
