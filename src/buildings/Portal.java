package buildings;

public class Portal extends Building{
    private int x,y;
    private int id;
    private int portalType;
    public Portal(int x, int y, int id, int portalType) {
        super(x,y,id);
    }

    public int getPortalType() {
        return portalType;
    }

}
